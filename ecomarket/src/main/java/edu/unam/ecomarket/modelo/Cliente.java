package edu.unam.ecomarket.modelo;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("cliente") // Valor específico para esta subclase en la columna "tipo"

@Getter @Setter @NoArgsConstructor
@Entity
public class Cliente extends Usuario {
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pedido> pedidos;

    public Cliente(String nombre, String contrasena, String email) {
        super(nombre, contrasena, email);  
    }
}

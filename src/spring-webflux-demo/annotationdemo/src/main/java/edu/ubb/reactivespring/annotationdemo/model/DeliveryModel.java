package edu.ubb.reactivespring.annotationdemo.model;


import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@RequiredArgsConstructor
public class DeliveryModel {
    @Id
    private String id;
    public String toAddress;
    private String customer;
}

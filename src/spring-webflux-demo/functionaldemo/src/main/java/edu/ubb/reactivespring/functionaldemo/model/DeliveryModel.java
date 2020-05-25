package edu.ubb.reactivespring.functionaldemo.model;


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
    public  String customer;
}

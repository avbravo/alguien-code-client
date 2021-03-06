/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.alguien.code.client;

import com.avbravo.alguien.code.annotation.AutoImplement;
import com.avbravo.alguien.code.annotation.Mandatory;
import java.time.LocalDate;

/**
 *
 * @author avbravo
 */
@AutoImplement(as = "User", builder = true)
public interface IUser {

    @Mandatory
    String getFirstName();

    @Mandatory
    String getLastName();

    LocalDate getDateOfBirth();

    String getPlaceOfBirth();

    String getPhone();

    String getAddress();
}

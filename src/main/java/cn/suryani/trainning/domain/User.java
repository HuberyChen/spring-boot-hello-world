package cn.suryani.trainning.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Robin.Lian on 2014/11/27.
 */
@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
public class User implements Serializable {

    private static final long serialVersionUID = 2686295496005000373L;

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 20)
    @NonNull
    private String name;

}

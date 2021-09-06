package com.imooc.ad.entity;

import com.imooc.ad.constant.CommonStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_unit")
public class AdUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "plan_id",nullable = false)
    private Long planId;

    @Basic
    @Column(name = "unit_name",nullable = false)
    private String unitName;

    @Basic
    @Column(name = "unit_status",nullable = false)
    private Integer unitStatus;

    @Basic
    @Column(name = "position_type",nullable = false)
    private Integer positionType;

    @Basic
    @Column(name = "budget",nullable = false)
    private Long budget;//预算

    @Basic
    @Column(name = "create_time",nullable = false)
    private Date createTime;

    @Basic
    @Column(name = "end_time",nullable = false)
    private Date endTime;

    public AdUnit(Long planId, String unitName, Integer positionType, Long budget) {
        this.planId = planId;
        this.unitName = unitName;
        this.unitStatus = CommonStatus.VALID.getStatus();
        this.positionType = positionType;
        this.budget = budget;
        this.createTime = new Date();
        this.endTime = this.createTime;
    }
}

package com.djk.TDengineData.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 铸轧机实体类
 * @TableName one_castroll
 */
@TableName(value ="one_castroll")
@Data
public class OneCastRoll implements Serializable {
    /**
     * ts
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date ts;

    /**
     * 上辊电机电流
     */
    private Double upRollMontorA;

    /**
     * 上辊电机线速度
     */
    private Double upRollMontorLineV;

    /**
     * 下辊电机电流
     */
    private Double downRollMontorA;

    /**
     * 下辊电机线速度
     */
    private Double downRollMontorLineV;

    /**
     * 水泵电流
     */
    private Double pumpA;

    /**
     * 水泵频率
     */
    private Double pumpF;

    /**
     * 卷取电流
     */
    private Double rollA;

    /**
     * 卷取速度
     */
    private Double rollV;

    /**
     * 入口水温
     */
    private Double inWaterT;

    /**
     * 入口水压
     */
    private Double inWaterFn;

    /**
     * 上辊水压
     */
    private Double upRollWaterFn;

    /**
     * 上辊水温
     */
    private Double upRollWaterT;

    /**
     * 上辊流量
     */
    private Double upRollFlow;

    /**
     * 下辊水压
     */
    private Double downRollWaterFn;

    /**
     * 下辊水温
     */
    private Double downRollWaterT;

    /**
     * 下辊流量
     */
    private Double downRollFlow;

    /**
     * 操作侧预载力
     */
    private Double operationPreloadForce;

    /**
     * 传动侧预载力
     */
    private Double transPreloadForce;

    /**
     * 卷取机张力
     */
    private Double rollTension;

    /**
     * 卷取卷径
     */
    private Double rollDiameter;

    /**
     * 钛丝速度
     */
    private Double tiWireSpeed;

    /**
     * 带材速度
     */
    private Double withMaterialSpeed;

    /**
     * 插入时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}

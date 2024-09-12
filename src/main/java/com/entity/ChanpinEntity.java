package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 产品信息
 *
 * @author 
 * @email
 */
@TableName("chanpin")
public class ChanpinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChanpinEntity() {

	}

	public ChanpinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 产品名称
     */
    @TableField(value = "chanpin_name")

    private String chanpinName;


    /**
     * 产品类型
     */
    @TableField(value = "chanpin_types")

    private Integer chanpinTypes;


    /**
     * 单瓶净含量
     */
    @TableField(value = "chanpin_jinghanlinag")

    private Integer chanpinJinghanlinag;


    /**
     * 保质期
     */
    @TableField(value = "chanpin_baozhiqi")

    private String chanpinBaozhiqi;


    /**
     * 配料表
     */
    @TableField(value = "chanpin_peiliao")

    private String chanpinPeiliao;


    /**
     * 饮酒场合
     */
    @TableField(value = "chanpin_changhe")

    private String chanpinChanghe;


    /**
     * 产品缩略图
     */
    @TableField(value = "chanpin_photo")

    private String chanpinPhoto;


    /**
     * 产品单价
     */
    @TableField(value = "chanpin_new_money")

    private Double chanpinNewMoney;


    /**
     * 产品简介
     */
    @TableField(value = "chanpin_content")

    private String chanpinContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：产品名称
	 */
    public String getChanpinName() {
        return chanpinName;
    }


    /**
	 * 获取：产品名称
	 */

    public void setChanpinName(String chanpinName) {
        this.chanpinName = chanpinName;
    }
    /**
	 * 设置：产品类型
	 */
    public Integer getChanpinTypes() {
        return chanpinTypes;
    }


    /**
	 * 获取：产品类型
	 */

    public void setChanpinTypes(Integer chanpinTypes) {
        this.chanpinTypes = chanpinTypes;
    }
    /**
	 * 设置：单瓶净含量
	 */
    public Integer getChanpinJinghanlinag() {
        return chanpinJinghanlinag;
    }


    /**
	 * 获取：单瓶净含量
	 */

    public void setChanpinJinghanlinag(Integer chanpinJinghanlinag) {
        this.chanpinJinghanlinag = chanpinJinghanlinag;
    }
    /**
	 * 设置：保质期
	 */
    public String getChanpinBaozhiqi() {
        return chanpinBaozhiqi;
    }


    /**
	 * 获取：保质期
	 */

    public void setChanpinBaozhiqi(String chanpinBaozhiqi) {
        this.chanpinBaozhiqi = chanpinBaozhiqi;
    }
    /**
	 * 设置：配料表
	 */
    public String getChanpinPeiliao() {
        return chanpinPeiliao;
    }


    /**
	 * 获取：配料表
	 */

    public void setChanpinPeiliao(String chanpinPeiliao) {
        this.chanpinPeiliao = chanpinPeiliao;
    }
    /**
	 * 设置：饮酒场合
	 */
    public String getChanpinChanghe() {
        return chanpinChanghe;
    }


    /**
	 * 获取：饮酒场合
	 */

    public void setChanpinChanghe(String chanpinChanghe) {
        this.chanpinChanghe = chanpinChanghe;
    }
    /**
	 * 设置：产品缩略图
	 */
    public String getChanpinPhoto() {
        return chanpinPhoto;
    }


    /**
	 * 获取：产品缩略图
	 */

    public void setChanpinPhoto(String chanpinPhoto) {
        this.chanpinPhoto = chanpinPhoto;
    }
    /**
	 * 设置：产品单价
	 */
    public Double getChanpinNewMoney() {
        return chanpinNewMoney;
    }


    /**
	 * 获取：产品单价
	 */

    public void setChanpinNewMoney(Double chanpinNewMoney) {
        this.chanpinNewMoney = chanpinNewMoney;
    }
    /**
	 * 设置：产品简介
	 */
    public String getChanpinContent() {
        return chanpinContent;
    }


    /**
	 * 获取：产品简介
	 */

    public void setChanpinContent(String chanpinContent) {
        this.chanpinContent = chanpinContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Chanpin{" +
            "id=" + id +
            ", chanpinName=" + chanpinName +
            ", chanpinTypes=" + chanpinTypes +
            ", chanpinJinghanlinag=" + chanpinJinghanlinag +
            ", chanpinBaozhiqi=" + chanpinBaozhiqi +
            ", chanpinPeiliao=" + chanpinPeiliao +
            ", chanpinChanghe=" + chanpinChanghe +
            ", chanpinPhoto=" + chanpinPhoto +
            ", chanpinNewMoney=" + chanpinNewMoney +
            ", chanpinContent=" + chanpinContent +
            ", createTime=" + createTime +
        "}";
    }
}

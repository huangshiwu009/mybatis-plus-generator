package com.syd666.hotel.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 酒店星级表
 * </p>
 *
 * @author Huang Shiwu
 * @since 2019-02-25
 */
@TableName("syd_hotel_star")
@ApiModel(value="Star对象", description="酒店星级表")
public class Star implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = " 描述")
    private String remark;

    @ApiModelProperty(value = "状态：0停用 1启用")
    private Byte status;

    @ApiModelProperty(value = "排序")
    private Byte sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Star{" +
        "id=" + id +
        ", title=" + title +
        ", remark=" + remark +
        ", status=" + status +
        ", sort=" + sort +
        "}";
    }
}

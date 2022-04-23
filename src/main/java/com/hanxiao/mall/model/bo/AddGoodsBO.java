package com.hanxiao.mall.model.bo;

import java.util.List;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/23
 **/

public class AddGoodsBO {

    /**
     * img : file/4/9/5/d/e/9/d/b/086a4c6c-d8c3-4176-98d0-44c28229f374iphone.jpeg
     * name : iphone14
     * typeId : 1
     * desc : 好东西
     */
    private String img;
    private String name;
    private Integer typeId;
    private String desc;

    public List<AddGoodsSpecBO> getSpecList() {
        return specList;
    }

    public void setSpecList(List<AddGoodsSpecBO> specList) {
        this.specList = specList;
    }

    private List<AddGoodsSpecBO> specList;

    public void setImg(String img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public String getDesc() {
        return desc;
    }
}

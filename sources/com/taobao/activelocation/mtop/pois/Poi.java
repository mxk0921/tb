package com.taobao.activelocation.mtop.pois;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Poi implements IMTOPDataObject {
    private String address;
    private String direction;
    private float distance;
    private String location;
    private String name;
    private String tel;
    private String type;

    static {
        t2o.a(789577753);
        t2o.a(589299906);
    }

    public String getAddress() {
        return this.address;
    }

    public String getDirection() {
        return this.direction;
    }

    public float getDistance() {
        return this.distance;
    }

    public String getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public String getTel() {
        return this.tel;
    }

    public String getType() {
        return this.type;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setDirection(String str) {
        this.direction = str;
    }

    public void setDistance(float f) {
        this.distance = f;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTel(String str) {
        this.tel = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}

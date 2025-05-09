package com.alibaba.security.realidentity.service.sensor.model;

import java.io.Serializable;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RpCollectInfo implements Serializable {
    public static final int DATA_VERSION = 1;
    public String activityName;
    public List<DisplayInfo> displayInfoArray;
    public int displayModelSize;
    public List<MotionEventData> motionDataArray;
    public int motionListSize;
    public List<SensorData> sensorDataArray;
    public int sensorListSize;
    public long timestamp;
    public int version = 1;
}

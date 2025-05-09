package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IMainFeedsLoopStartStopService extends ISubService {
    public static final String SERVICE_NAME = "MainFeedsLoopStartStopService";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface IStartAndStopType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        public static final String APP_SWITCH = "appSwitch";
        public static final String MUTI_CLASS_TAB_SWITCH = "multiClassTabSwitch";
        public static final String PAGE_SWITCH = "pageSwitch";
        public static final String SECOND_FLOOR_SWITCH = "secondFloorSwitch";
        public static final String TAB_SWITCH = "tabSwitch";
        public static final String TOP_VIEW_COLD_START = "topViewColdStart";

        void a(String str);

        void onStart(String str);
    }

    boolean isAllowStart();

    void registerStartStopListener(a aVar);

    void unregisterStartStopListener(a aVar);
}

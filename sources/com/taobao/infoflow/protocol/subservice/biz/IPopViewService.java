package com.taobao.infoflow.protocol.subservice.biz;

import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.iqb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IPopViewService extends ISubService, iqb {
    public static final String SERVICE_NAME = "PopViewService";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface InfoFlowPopMessageType {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface InfoFlowPopTriggerType {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface InfoflowPopEventType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a(String str, Object obj, JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        void a(String str);

        void b(String str);
    }

    /* synthetic */ void addOnContainerListener(iqb.a aVar);

    void addPopEventListener(b bVar);

    void addPopMessageListener(a aVar);

    void addPopViewUpdateListener(c cVar);

    @Override // tb.iqb
    /* synthetic */ ViewGroup createContainer(Context context);

    @Override // tb.iqb
    /* synthetic */ void destroyContainer();

    JSONObject getPopDataByBusinessId(String str);

    boolean isPopViewOnScreen(String str);

    void onIconScroll(int i);

    void onPopTabSelected();

    void onPopTabUnSelected();

    /* synthetic */ void removeOnContainerListener(iqb.a aVar);

    void removePopEventListener(b bVar);

    void removePopMessageListener(a aVar);

    void removePopViewUpdateListener(c cVar);

    void triggerPopEvent(int i, String str);

    void triggerPopRemove(String str);

    void triggerPopShow(int i, String str);

    void triggerPopShowByCustomData(JSONObject jSONObject);

    boolean triggerPopShowByPopData(int i, JSONObject jSONObject);

    void triggerPopShowWithDataReset(int i, String str);
}

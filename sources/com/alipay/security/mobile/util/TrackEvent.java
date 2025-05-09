package com.alipay.security.mobile.util;

import android.os.Bundle;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TrackEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static TrackEvent mInstance = null;
    public static String mUserId = "";

    private String format() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9662a762", new Object[]{this});
        }
        return new SimpleDateFormat("yyyy-dd-MM HH:mm:ss:SSS").format(new Date()) + ";";
    }

    public static TrackEvent getIns() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackEvent) ipChange.ipc$dispatch("9847879f", new Object[0]);
        }
        if (mInstance == null) {
            mInstance = new TrackEvent();
        }
        return mInstance;
    }

    public void addMonitorKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f899641", new Object[]{this, str, str2});
            return;
        }
        try {
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str);
            uTHitBuilders$UTCustomHitBuilder.setEventPage("ifaa_monitor");
            HashMap hashMap = new HashMap();
            hashMap.put("monitorKey", str2.replace(" ", "_"));
            uTHitBuilders$UTCustomHitBuilder.setProperties(hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
        } catch (Exception e) {
            AuthenticatorLOG.fpInfo("fp event logger = " + e.toString());
        }
    }

    public void commit(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce7d5d6", new Object[]{this, bundle});
        } else {
            BioBehaviorUtils.getInstance().commit(bundle);
        }
    }

    public void event(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5951d81d", new Object[]{this, bundle, str});
            return;
        }
        AuthenticatorLOG.fpInfo("taobao fp track event!");
        try {
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("taobao ifaa_fingerprint");
            uTHitBuilders$UTCustomHitBuilder.setEventPage("ifaa_fingerprint");
            uTHitBuilders$UTCustomHitBuilder.setProperty("taobao fp log", "ifaa fingerprint : uid = " + mUserId + "time = " + format() + " loginfo = " + str);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
        } catch (Exception e) {
            AuthenticatorLOG.fpInfo("fp event logger = " + e.toString());
        }
    }

    public void commit(AuthenticatorMessage authenticatorMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b401f", new Object[]{this, authenticatorMessage});
        } else {
            BioBehaviorUtils.getInstance().commit(authenticatorMessage);
        }
    }
}

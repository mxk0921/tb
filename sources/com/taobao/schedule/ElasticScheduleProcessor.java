package com.taobao.schedule;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import tb.la8;
import tb.xnj;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ElasticScheduleProcessor implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "elastic.ScheduleProcessor";

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "ElasticScheduleProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        try {
            data = intent.getData();
        } catch (Throwable th) {
            la8.b(TAG, "[process] error.", th, new Object[0]);
        }
        if (data == null) {
            return true;
        }
        ElasticSchedulerEngine.m().q().f(data.toString());
        ElasticSchedulerEngine.m().b().k(data);
        return true;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }
}

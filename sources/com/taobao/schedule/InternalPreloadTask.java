package com.taobao.schedule;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.android.ab.api.ABGlobal;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.la8;
import tb.pa8;
import tb.ra8;
import tb.z1c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class InternalPreloadTask implements z1c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Properties f11523a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class Properties implements Serializable {
        @JSONField(name = "abKey")
        public String abKey;
        @JSONField(name = "callMethod")
        public String callMethod;
        @JSONField(name = "cancelMethod")
        public String cancelMethod;
        @JSONField(name = "className")
        public String className;
        @JSONField(name = "matchTypes")
        public List<String> matchTypes;
        @JSONField(name = "matchViews")
        public List<String> matchViews;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "needParams")
        public boolean needParams;
        @JSONField(name = "once")
        public boolean once;
        @JSONField(name = "supportCancel")
        public boolean supportCancel;
        @JSONField(name = "supportUnifiedDispatch")
        public boolean supportUnifiedDispatch = false;
    }

    public InternalPreloadTask(Properties properties) {
        this.f11523a = properties;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f11523a.name + "@" + hashCode();
    }

    @Override // tb.z1c
    public boolean a(String str, String str2) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("216932e4", new Object[]{this, str, str2})).booleanValue();
        }
        List<String> list2 = this.f11523a.matchViews;
        if (list2 == null || list2.isEmpty() || !this.f11523a.matchViews.contains(str) || (list = this.f11523a.matchTypes) == null || list.isEmpty() || !this.f11523a.matchTypes.contains(str2)) {
            return false;
        }
        if (TextUtils.isEmpty(this.f11523a.abKey) || ABGlobal.isFeatureOpened(pa8.a(), this.f11523a.abKey)) {
            la8.c("elastic.InternalPreloadTask", "[match] properties hit.", "view", str, "type", str2);
            return true;
        }
        la8.c("elastic.InternalPreloadTask", "[match]ab experiment is disable.", "view", str, "type", str2, "abKey", this.f11523a.abKey);
        return false;
    }

    @Override // tb.z1c
    public void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ef43b3", new Object[]{this, map});
        } else if (!this.f11523a.once || this.b.compareAndSet(false, true)) {
            la8.c("elastic.InternalPreloadTask", "[run] called.", BaseMnnRunUnit.KEY_TASK_NAME, this.f11523a.name);
            try {
                if (this.f11523a.supportUnifiedDispatch) {
                    ElasticSchedulerEngine.m().b().p();
                }
                Properties properties = this.f11523a;
                if (properties.needParams) {
                    Context a2 = pa8.a();
                    Properties properties2 = this.f11523a;
                    ra8.d(properties2.className, properties2.callMethod, new Class[]{Context.class, Map.class}, a2, map);
                    return;
                }
                ra8.d(properties.className, properties.callMethod, null, new Object[0]);
            } catch (Exception e) {
                la8.b("elastic.InternalPreloadTask", "[run] error.", e, new Object[0]);
            }
        }
    }

    @Override // tb.z1c
    public void c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8db1364", new Object[]{this, map});
            return;
        }
        Properties properties = this.f11523a;
        if (properties.supportCancel && !TextUtils.isEmpty(properties.cancelMethod)) {
            la8.c("elastic.InternalPreloadTask", "[cancel] called.", BaseMnnRunUnit.KEY_TASK_NAME, this.f11523a.name);
            try {
                if (this.f11523a.supportUnifiedDispatch) {
                    ElasticSchedulerEngine.m().b().l();
                }
                Properties properties2 = this.f11523a;
                if (properties2.needParams) {
                    Context a2 = pa8.a();
                    Properties properties3 = this.f11523a;
                    ra8.d(properties3.className, properties3.cancelMethod, new Class[]{Context.class, Map.class}, a2, map);
                    return;
                }
                ra8.d(properties2.className, properties2.cancelMethod, null, new Object[0]);
            } catch (Exception e) {
                la8.b("elastic.InternalPreloadTask", "[run] error.", e, new Object[0]);
            }
        }
    }
}

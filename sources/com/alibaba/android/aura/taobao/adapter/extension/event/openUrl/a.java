package com.alibaba.android.aura.taobao.adapter.extension.event.openUrl;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0062a f2156a;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface AbstractC0062a {
        void a(String str, Intent intent);

        void b(String str, Intent intent);
    }

    static {
        t2o.a(81789074);
    }

    public Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("62345009", new Object[]{this});
        }
        return null;
    }

    public AbstractC0062a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractC0062a) ipChange.ipc$dispatch("4a721ff", new Object[]{this});
        }
        return this.f2156a;
    }

    public void c(AbstractC0062a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8a8633", new Object[]{this, aVar});
        } else {
            this.f2156a = aVar;
        }
    }
}

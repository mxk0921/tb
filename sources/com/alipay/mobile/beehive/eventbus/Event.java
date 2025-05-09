package com.alipay.mobile.beehive.eventbus;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f3880a;
    public Object data;
    public Object key;
    public String name;

    public Event(String str, Object obj) {
        this.name = str;
        this.data = obj;
        boolean isEmpty = TextUtils.isEmpty(str);
        Class<?> cls = str;
        if (isEmpty) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
        }
        this.key = cls;
    }

    public static boolean isValid(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2253c48", new Object[]{event})).booleanValue();
        }
        if (event == null || event.key == null) {
            return false;
        }
        return true;
    }

    public static boolean keyEqual(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9980b0d8", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return false;
        }
        return TextUtils.equals((String) obj, (String) obj2);
    }

    public void addConsumeUid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4263306", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (this.f3880a == null) {
                this.f3880a = new ArrayList();
            }
            this.f3880a.add(str);
        }
    }

    public boolean isConsumed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0291447", new Object[]{this, str})).booleanValue();
        }
        List<String> list = this.f3880a;
        if (list == null) {
            return false;
        }
        for (String str2 : list) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public void setUniqueIds(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751fa5dd", new Object[]{this, list});
        } else {
            this.f3880a = list;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "name=" + this.name + ", data=" + this.data;
    }
}

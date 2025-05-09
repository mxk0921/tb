package com.alipay.sdk.m.d;

import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<UUID, a> f4523a = new HashMap<>();
    public static final HashMap<String, a> b = new HashMap<>();

    public static void a(a aVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4309938c", new Object[]{aVar, intent});
        } else if (aVar != null && intent != null) {
            UUID randomUUID = UUID.randomUUID();
            f4523a.put(randomUUID, aVar);
            intent.putExtra("i_uuid_b_c", randomUUID);
        }
    }

    public static a a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1ac37bf8", new Object[]{intent});
        }
        if (intent == null) {
            return null;
        }
        Serializable serializableExtra = intent.getSerializableExtra("i_uuid_b_c");
        if (serializableExtra instanceof UUID) {
            return f4523a.remove(serializableExtra);
        }
        return null;
    }

    public static void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7ffcd9", new Object[]{aVar, str});
        } else if (aVar != null && !TextUtils.isEmpty(str)) {
            b.put(str, aVar);
        }
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e374e60b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return b.remove(str);
    }
}

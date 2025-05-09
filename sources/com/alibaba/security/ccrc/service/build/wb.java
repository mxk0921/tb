package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2633a = "wukong_internal_config";
    public static final Map<String, SharedPreferences> b = new HashMap();
    public final Context c;

    public wb(Context context) {
        this.c = context;
    }

    private synchronized SharedPreferences a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("551a7086", new Object[]{this, str});
        }
        Map<String, SharedPreferences> map = b;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        SharedPreferences sharedPreferences = this.c.getSharedPreferences(str, 0);
        map.put(str, sharedPreferences);
        return sharedPreferences;
    }

    public void b(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cf6319", new Object[]{this, str, str2, obj});
        } else if (obj != null) {
            String simpleName = obj.getClass().getSimpleName();
            SharedPreferences.Editor edit = a(str).edit();
            if (simpleName.equals(pg1.ATOM_String)) {
                edit.putString(str2, (String) obj);
            } else if (simpleName.equals("Integer")) {
                edit.putInt(str2, ((Integer) obj).intValue());
            } else if (simpleName.equals("Long")) {
                edit.putLong(str2, ((Long) obj).longValue());
            } else if (simpleName.equals("Float")) {
                edit.putFloat(str2, ((Float) obj).floatValue());
            } else if (simpleName.equals(pg1.ATOM_Boolean)) {
                edit.putBoolean(str2, ((Boolean) obj).booleanValue());
            }
            edit.apply();
        }
    }

    public Object a(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d321fbda", new Object[]{this, str, str2, obj});
        }
        if (obj == null) {
            obj = "";
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.equals(pg1.ATOM_Boolean)) {
            return Boolean.valueOf(a(str).getBoolean(str2, ((Boolean) obj).booleanValue()));
        }
        if (simpleName.equals("Float")) {
            return Float.valueOf(a(str).getFloat(str2, ((Float) obj).floatValue()));
        }
        if (simpleName.equals("Integer")) {
            return Integer.valueOf(a(str).getInt(str2, ((Integer) obj).intValue()));
        }
        if (simpleName.equals(pg1.ATOM_String)) {
            return a(str).getString(str2, (String) obj);
        }
        if ("Long".equals(simpleName)) {
            return Long.valueOf(a(str).getLong(str2, ((Long) obj).longValue()));
        }
        return null;
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            a(str).edit().remove(str2).apply();
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : a(str).contains(str2);
    }
}

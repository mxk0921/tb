package com.taobao.android.xsearchplugin.jarvis.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mMaxSize;

    static {
        t2o.a(995098659);
    }

    public FixedSizeLinkedHashMap(int i) {
        super(16, 0.75f, false);
        this.mMaxSize = i;
    }

    public static /* synthetic */ Object ipc$super(FixedSizeLinkedHashMap fixedSizeLinkedHashMap, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/jarvis/utils/FixedSizeLinkedHashMap");
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
        }
        if (size() > this.mMaxSize) {
            return true;
        }
        return false;
    }

    public void setMaxSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2c5079", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxSize = i;
        }
    }
}

package com.taobao.orange.candidate;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jlb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DefCandidateCompare implements jlb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean innerOptimized = false;

    static {
        t2o.a(613417058);
        t2o.a(613416989);
    }

    @Override // tb.jlb
    public boolean equals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c24d6de", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // tb.jlb
    public boolean equalsNot(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ecd44b3", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // tb.jlb
    public boolean fuzzy(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81bf5629", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // tb.jlb
    public boolean fuzzyNot(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44d07d88", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // tb.jlb
    public boolean greater(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4d1ac19", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // tb.jlb
    public boolean greaterEquals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6920a978", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // tb.jlb
    public boolean less(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd7e96b8", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // tb.jlb
    public boolean lessEquals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df4e0d7", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }
}

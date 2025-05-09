package com.taobao.orange.candidate;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StringCompare extends DefCandidateCompare {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(613417062);
    }

    public static /* synthetic */ Object ipc$super(StringCompare stringCompare, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/candidate/StringCompare");
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean equals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c24d6de", new Object[]{this, str, str2})).booleanValue();
        }
        return str.equals(str2);
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean equalsNot(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ecd44b3", new Object[]{this, str, str2})).booleanValue();
        }
        return !str.equals(str2);
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean fuzzy(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81bf5629", new Object[]{this, str, str2})).booleanValue();
        }
        return str.startsWith(str2);
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean fuzzyNot(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44d07d88", new Object[]{this, str, str2})).booleanValue();
        }
        return !str.startsWith(str2);
    }
}

package com.taobao.orange.candidate;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.OLog;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.ibl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HashCompare extends DefCandidateCompare {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HashCompare";
    private static Pattern p = Pattern.compile("\\d+");
    private volatile Long mHashBase = null;

    static {
        t2o.a(613417059);
    }

    public static /* synthetic */ Object ipc$super(HashCompare hashCompare, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/candidate/HashCompare");
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean equals(String str, String str2) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c24d6de", new Object[]{this, str, str2})).booleanValue();
        }
        Matcher matcher = p.matcher(str2);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(Integer.valueOf(Integer.parseInt(matcher.group())));
        }
        if (arrayList.size() == 3) {
            if (this.innerOptimized) {
                if (this.mHashBase == null) {
                    synchronized (this) {
                        this.mHashBase = Long.valueOf(ibl.i(str));
                    }
                }
                j = this.mHashBase.longValue() % ((Integer) arrayList.get(0)).intValue();
            } else {
                j = ibl.i(str) % ((Integer) arrayList.get(0)).intValue();
            }
            if (OLog.isPrintLog(0)) {
                OLog.v(TAG, "equals", "mod", Long.valueOf(j));
            }
            return j >= ((long) ((Integer) arrayList.get(1)).intValue()) && j <= ((long) ((Integer) arrayList.get(2)).intValue());
        }
        throw new IllegalArgumentException("did_hash candidate format is illegal");
    }
}

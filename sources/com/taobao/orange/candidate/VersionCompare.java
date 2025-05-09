package com.taobao.orange.candidate;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class VersionCompare extends DefCandidateCompare {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile int[] clientVersion = null;

    static {
        t2o.a(613417066);
    }

    public static /* synthetic */ Object ipc$super(VersionCompare versionCompare, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/candidate/VersionCompare");
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

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean greater(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4d1ac19", new Object[]{this, str, str2})).booleanValue();
        }
        if (compareVersion(str, str2) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean greaterEquals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6920a978", new Object[]{this, str, str2})).booleanValue();
        }
        if (compareVersion(str, str2) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean less(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd7e96b8", new Object[]{this, str, str2})).booleanValue();
        }
        if (compareVersion(str, str2) == -1) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean lessEquals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df4e0d7", new Object[]{this, str, str2})).booleanValue();
        }
        if (compareVersion(str, str2) != 1) {
            return true;
        }
        return false;
    }

    private int compareVersion(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9bbef41", new Object[]{this, str, str2})).intValue();
        }
        if (str.equals(str2)) {
            return 0;
        }
        if (this.innerOptimized) {
            return innerOptimizedCompare(str, str2);
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        int i2 = 0;
        while (i < min) {
            i2 = Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
            if (i2 != 0) {
                break;
            }
            i++;
        }
        if (i2 != 0) {
            return i2 > 0 ? 1 : -1;
        }
        for (int i3 = i; i3 < split.length; i3++) {
            if (Integer.parseInt(split[i3]) > 0) {
                return 1;
            }
        }
        while (i < split2.length) {
            if (Integer.parseInt(split2[i]) > 0) {
                return -1;
            }
            i++;
        }
        return 0;
    }

    private int innerOptimizedCompare(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7ca642", new Object[]{this, str, str2})).intValue();
        }
        if (this.clientVersion == null) {
            synchronized (this) {
                try {
                    if (this.clientVersion == null) {
                        String[] split = str.split("\\.");
                        this.clientVersion = new int[split.length];
                        for (int i = 0; i < split.length; i++) {
                            this.clientVersion[i] = Integer.parseInt(split[i]);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String[] split2 = str2.split("\\.");
        int min = Math.min(this.clientVersion.length, split2.length);
        int i2 = 0;
        int i3 = 0;
        while (i2 < min) {
            i3 = this.clientVersion[i2] - Integer.parseInt(split2[i2]);
            if (i3 != 0) {
                break;
            }
            i2++;
        }
        if (i3 != 0) {
            return i3 > 0 ? 1 : -1;
        }
        for (int i4 = i2; i4 < this.clientVersion.length; i4++) {
            if (this.clientVersion[i4] > 0) {
                return 1;
            }
        }
        while (i2 < split2.length) {
            if (Integer.parseInt(split2[i2]) > 0) {
                return -1;
            }
            i2++;
        }
        return 0;
    }
}

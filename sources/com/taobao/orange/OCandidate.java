package com.taobao.orange;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.aidl.OrangeCandidateCompareStub;
import com.taobao.orange.aidl.ParcelableCandidateCompare;
import com.taobao.orange.candidate.DefCandidateCompare;
import tb.jlb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OCandidate {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f11378a;
    public final String b;
    public final ParcelableCandidateCompare c;

    static {
        t2o.a(613416991);
    }

    public OCandidate(String str, String str2, Class<? extends jlb> cls, boolean z) {
        if (TextUtils.isEmpty(str) || cls == null) {
            throw new IllegalArgumentException("key or compare is null");
        }
        this.f11378a = str;
        this.b = str2;
        try {
            jlb jlbVar = (jlb) cls.newInstance();
            if (jlbVar instanceof DefCandidateCompare) {
                ((DefCandidateCompare) jlbVar).innerOptimized = z;
            }
            this.c = new OrangeCandidateCompareStub(jlbVar);
        } catch (Exception unused) {
            this.c = new OrangeCandidateCompareStub(new DefCandidateCompare());
        }
    }

    public boolean a(OCandidate oCandidate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46c5e47d", new Object[]{this, oCandidate})).booleanValue();
        }
        if (oCandidate == null) {
            return false;
        }
        if (this == oCandidate) {
            return true;
        }
        if (!this.f11378a.equals(oCandidate.f11378a)) {
            return false;
        }
        String str = this.b;
        if (str == null ? oCandidate.b != null : !str.equals(oCandidate.b)) {
            return false;
        }
        if (((OrangeCandidateCompareStub) this.c).getRealClass() == ((OrangeCandidateCompareStub) oCandidate.c).getRealClass()) {
            return true;
        }
        return false;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2391e59", new Object[]{this});
        }
        return this.b;
    }

    public ParcelableCandidateCompare c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParcelableCandidateCompare) ipChange.ipc$dispatch("a99b99d1", new Object[]{this});
        }
        return this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.f11378a;
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        ParcelableCandidateCompare parcelableCandidateCompare = this.c;
        if (parcelableCandidateCompare instanceof OrangeCandidateCompareStub) {
            str = ((OrangeCandidateCompareStub) parcelableCandidateCompare).getName();
        } else {
            str = null;
        }
        return this.f11378a + "=" + this.b + " " + str;
    }

    public OCandidate(String str, String str2, ParcelableCandidateCompare parcelableCandidateCompare) {
        if (TextUtils.isEmpty(str) || parcelableCandidateCompare == null) {
            throw new IllegalArgumentException("key or compare is null");
        }
        this.f11378a = str;
        this.b = str2;
        this.c = parcelableCandidateCompare;
    }
}

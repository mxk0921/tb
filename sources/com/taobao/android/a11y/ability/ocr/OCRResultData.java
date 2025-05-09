package com.taobao.android.a11y.ability.ocr;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OCRResultData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f6250a;
    public final ResultType b;
    public String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum ResultType {
        SUCCESS,
        HOLD,
        FAIL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ResultType resultType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/a11y/ability/ocr/OCRResultData$ResultType");
        }

        public static ResultType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResultType) ipChange.ipc$dispatch("80950c5c", new Object[]{str});
            }
            return (ResultType) Enum.valueOf(ResultType.class, str);
        }
    }

    static {
        t2o.a(335544350);
    }

    public OCRResultData(String str, ResultType resultType) {
        this.f6250a = str;
        this.b = resultType;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        }
        return this.f6250a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12310f2b", new Object[]{this});
        }
        return this.c;
    }

    public ResultType c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultType) ipChange.ipc$dispatch("7c19489e", new Object[]{this});
        }
        return this.b;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af45f13", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }
}

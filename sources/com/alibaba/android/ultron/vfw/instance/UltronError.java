package com.alibaba.android.ultron.vfw.instance;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronError extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String code;
    public String domain;
    public Map<String, Object> extParams;
    public String extraMsg;
    public String type;

    static {
        t2o.a(157286642);
    }

    public UltronError() {
        this.type = "other";
    }

    public static /* synthetic */ Object ipc$super(UltronError ultronError, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/instance/UltronError");
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AURAError{, code='" + this.code + "', type='" + this.type + "', extraMsg='" + this.extraMsg + "', domain='" + this.domain + "'}";
    }

    public UltronError(String str) {
        super(str);
        this.type = "other";
    }

    public UltronError(String str, String str2, String str3, String str4, Map<String, Object> map) {
        this.domain = str;
        this.code = str2;
        this.extraMsg = str3;
        this.type = str4;
        this.extParams = map;
    }
}

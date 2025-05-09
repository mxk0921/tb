package com.taobao.phenix.intf.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.b1m;
import tb.p1m;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FailPhenixEvent extends b1m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int httpCode;
    public String httpMessage;
    public int resultCode;

    static {
        t2o.a(620757100);
    }

    public FailPhenixEvent(p1m p1mVar) {
        super(p1mVar);
    }

    public static /* synthetic */ Object ipc$super(FailPhenixEvent failPhenixEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/intf/event/FailPhenixEvent");
    }

    public int getHttpCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58026b05", new Object[]{this})).intValue();
        }
        return this.httpCode;
    }

    public String getHttpMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f848570", new Object[]{this});
        }
        return this.httpMessage;
    }

    public int getResultCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c6a001a", new Object[]{this})).intValue();
        }
        return this.resultCode;
    }

    public void setHttpCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b21d0a5", new Object[]{this, new Integer(i)});
        } else {
            this.httpCode = i;
        }
    }

    public void setHttpMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c3576e", new Object[]{this, str});
        } else {
            this.httpMessage = str;
        }
    }

    public void setResultCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ad1130", new Object[]{this, new Integer(i)});
        } else {
            this.resultCode = i;
        }
    }
}

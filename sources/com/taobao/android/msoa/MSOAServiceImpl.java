package com.taobao.android.msoa;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.djf;
import tb.srh;
import tb.trh;
import tb.urh;
import tb.wrh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MSOAServiceImpl implements wrh, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.wrh
    public void cancelTimeoutTask(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c5d93d", new Object[]{this, str});
        } else {
            trh.k().j(str);
        }
    }

    public void obtainServiceAsync(srh srhVar, djf djfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b42b8bb", new Object[]{this, srhVar, djfVar});
        }
    }

    public <T> T obtainServiceSync(srh srhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("17213ac3", new Object[]{this, srhVar});
        }
        return (T) trh.k().m(srhVar);
    }

    @Override // tb.wrh
    public void requestService(urh urhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d53721", new Object[]{this, urhVar});
        } else {
            trh.k().n(urhVar);
        }
    }

    @Override // tb.wrh
    public void tryUnbindService(urh urhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42fac83", new Object[]{this, urhVar});
        } else {
            trh.k().o(urhVar);
        }
    }
}

package com.taobao.taobao.scancode.history.object;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ScanList implements IMTOPDataObject, Serializable {
    private List<ScanDo> list;
    private boolean networkAvailable = true;
    private boolean OldLogic = true;

    static {
        t2o.a(760217757);
        t2o.a(589299906);
    }

    public List<ScanDo> getList() {
        return this.list;
    }

    public boolean isNetworkAvailable() {
        return this.networkAvailable;
    }

    public boolean isOldLogic() {
        return this.OldLogic;
    }

    public void setList(List<ScanDo> list) {
        this.list = list;
    }

    public void setNetworkAvailable(boolean z) {
        this.networkAvailable = z;
    }

    public void setOldLogic(boolean z) {
        this.OldLogic = z;
    }
}

package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UltronConfigRequest implements INetDataObject {
    public String API_NAME = "mtop.tblive.live.item.ultron.render";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;
    public String VERSION = "1.0";
    public String domainCode = "taolivegoods";
    public List<String> pageCodes;

    static {
        t2o.a(295699185);
        t2o.a(806355930);
    }
}

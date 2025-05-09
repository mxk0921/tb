package com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmartLiveInteractRequest implements INetDataObject {
    public String anchorId;
    public String extendParams;
    public String interactTypes;
    public String liveId;
    public String API_NAME = "mtop.iliad.interact.queryliveinteracts";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;

    static {
        t2o.a(295699789);
        t2o.a(806355930);
    }
}

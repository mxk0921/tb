package com.taobao.tao.remotebusiness;

import mtopsdk.mtop.common.MtopHeaderEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.common.MtopProgressEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IRemoteProcessListener extends MtopListener {
    void onDataReceived(MtopProgressEvent mtopProgressEvent, Object obj);

    void onHeader(MtopHeaderEvent mtopHeaderEvent, Object obj);
}

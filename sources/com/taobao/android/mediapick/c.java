package com.taobao.android.mediapick;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.IMediaPickClient;
import com.taobao.android.mediapick.media.Media;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class c implements IMediaPickClient.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(519045142);
        t2o.a(519045131);
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient.a
    public void a(Media media, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d93e87", new Object[]{this, media, new Integer(i)});
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient.a
    public void b(Media media, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b062d24", new Object[]{this, media, new Integer(i)});
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient.a
    public void c(Media media, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9287594b", new Object[]{this, media, new Integer(i)});
        }
    }
}

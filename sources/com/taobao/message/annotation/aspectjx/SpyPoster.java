package com.taobao.message.annotation.aspectjx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/taobao/message/annotation/aspectjx/SpyPoster;", "", "<init>", "()V", "", "name", "args", "Ltb/xhv;", "post", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/taobao/message/annotation/aspectjx/SpyListener;", DataReceiveMonitor.CB_LISTENER, "register", "(Lcom/taobao/message/annotation/aspectjx/SpyListener;)V", "unRegister", "", "mutableList", "Ljava/util/List;", "getMutableList", "()Ljava/util/List;", "message_annotation_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SpyPoster {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SpyPoster INSTANCE = new SpyPoster();
    private static final List<SpyListener> mutableList = new ArrayList();

    static {
        t2o.a(528482309);
    }

    private SpyPoster() {
    }

    public final List<SpyListener> getMutableList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("18244472", new Object[]{this});
        }
        return mutableList;
    }

    public final void post(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5ebabb", new Object[]{this, str, str2});
            return;
        }
        ckf.h(str, "name");
        for (SpyListener spyListener : mutableList) {
            spyListener.invoked(str, str2);
        }
    }

    public final void register(SpyListener spyListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ceb318d", new Object[]{this, spyListener});
            return;
        }
        ckf.h(spyListener, DataReceiveMonitor.CB_LISTENER);
        mutableList.add(spyListener);
    }

    public final void unRegister(SpyListener spyListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c97c46", new Object[]{this, spyListener});
            return;
        }
        ckf.h(spyListener, DataReceiveMonitor.CB_LISTENER);
        mutableList.remove(spyListener);
    }
}

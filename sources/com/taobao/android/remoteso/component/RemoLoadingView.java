package com.taobao.android.remoteso.component;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.appbundle.remote.view.RemoteLoadingView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RemoLoadingView extends BaseRemoLoadingView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RemoteLoadingView loadingView;

    public RemoLoadingView(Context context) {
        super(context);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        RemoteLoadingView remoteLoadingView = new RemoteLoadingView(getContext(), new LoadConfig.b().l());
        this.loadingView = remoteLoadingView;
        addView(remoteLoadingView);
    }

    public static /* synthetic */ Object ipc$super(RemoLoadingView remoLoadingView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/remoteso/component/RemoLoadingView");
    }

    @Override // com.taobao.android.remoteso.component.BaseRemoLoadingView, tb.j0n
    public void onProgressChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5158474", new Object[]{this, new Integer(i)});
        } else {
            this.loadingView.updateProgress(i);
        }
    }

    public RemoLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public RemoLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public RemoLoadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }
}

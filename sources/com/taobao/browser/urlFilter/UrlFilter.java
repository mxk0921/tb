package com.taobao.browser.urlFilter;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class UrlFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Handler handler;
    public final List<URLFilterinterface> mURLFiltersCommon = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface URLFilterinterface {
        boolean doFilter(Context context, String str);
    }

    static {
        t2o.a(619708628);
    }

    public UrlFilter(Handler handler) {
        this.handler = handler;
    }

    public abstract boolean filtrate(String str);

    public void notifyParent(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd23d4ad", new Object[]{this, message});
            return;
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.sendMessage(message);
        }
    }

    public void registerURLFilter(URLFilterinterface uRLFilterinterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff3d285", new Object[]{this, uRLFilterinterface});
        } else {
            this.mURLFiltersCommon.add(uRLFilterinterface);
        }
    }

    public void setHandler(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc2a32bf", new Object[]{this, handler});
        } else {
            this.handler = handler;
        }
    }

    public void unregisterURLFilter(URLFilterinterface uRLFilterinterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2c471e", new Object[]{this, uRLFilterinterface});
        } else {
            this.mURLFiltersCommon.remove(uRLFilterinterface);
        }
    }
}

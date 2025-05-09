package com.taobao.tao.adapter.biz;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.sharepanel.normal.NativeSharePanel;
import com.taobao.tao.sharepanel.weex.WeexSharePanel;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import tb.cyw;
import tb.dmp;
import tb.eis;
import tb.epd;
import tb.hpd;
import tb.hwd;
import tb.ipd;
import tb.kip;
import tb.li3;
import tb.med;
import tb.opd;
import tb.pxr;
import tb.s02;
import tb.smb;
import tb.t2o;
import tb.whp;
import tb.xjp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareEngine implements ipd, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeakReference<s02> mCurSharePanel;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements epd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ShareEngine shareEngine) {
        }

        @Override // tb.epd
        public void a(eis eisVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d704ecfe", new Object[]{this, eisVar});
            } else {
                new pxr().e(eisVar);
            }
        }
    }

    static {
        t2o.a(793772034);
        t2o.a(665845798);
    }

    @Override // tb.ipd
    public smb getChanelEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (smb) ipChange.ipc$dispatch("8e715332", new Object[]{this});
        }
        return new li3();
    }

    @Override // tb.ipd
    public med getQRCodeScanEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (med) ipChange.ipc$dispatch("9c8796ce", new Object[]{this});
        }
        return new com.taobao.tao.scancode.a();
    }

    @Override // tb.ipd
    public epd getShareBizEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epd) ipChange.ipc$dispatch("5299f87c", new Object[]{this});
        }
        return new a(this);
    }

    @Override // tb.ipd
    public opd getSharePanel() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (opd) ipChange.ipc$dispatch("70745bbc", new Object[]{this});
        }
        if (kip.w()) {
            if (TextUtils.equals("1", dmp.d(WeexSharePanel.CACHE_SHOW_CHANNEL_TYPE_KEY, "2"))) {
                str = kip.n();
            } else {
                str = kip.e();
            }
            WeexSharePanel weexSharePanel = new WeexSharePanel(str);
            this.mCurSharePanel = new WeakReference<>(weexSharePanel);
            return weexSharePanel;
        }
        NativeSharePanel nativeSharePanel = new NativeSharePanel();
        this.mCurSharePanel = new WeakReference<>(nativeSharePanel);
        return nativeSharePanel;
    }

    @Override // tb.ipd
    public hwd getTLongPicEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hwd) ipChange.ipc$dispatch("12de9eb0", new Object[]{this});
        }
        return new com.taobao.tao.longpic.a();
    }

    @Override // tb.ipd
    public void initHandlerMappings(hpd hpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a7fd41", new Object[]{this, hpdVar});
            return;
        }
        whp whpVar = (whp) hpdVar;
        if (whpVar.f30701a == null) {
            whpVar.f30701a = new whp.a();
        }
        xjp.b().e(new cyw());
    }

    @Override // tb.ipd
    public s02 getCurSharePanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s02) ipChange.ipc$dispatch("2d3b312f", new Object[]{this});
        }
        WeakReference<s02> weakReference = this.mCurSharePanel;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.mCurSharePanel.get();
    }
}

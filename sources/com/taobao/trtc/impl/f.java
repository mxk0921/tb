package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.b;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.Iterator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TrtcEngineImpl f13948a;
    public final TrtcInnerDefines.TrtcVideoLayoutParams b;

    static {
        t2o.a(395313592);
        t2o.a(395313402);
    }

    public f(TrtcEngineImpl trtcEngineImpl) {
        this.f13948a = trtcEngineImpl;
        TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams = new TrtcInnerDefines.TrtcVideoLayoutParams();
        this.b = trtcVideoLayoutParams;
        trtcVideoLayoutParams.backgroundInfo = new TrtcInnerDefines.TrtcVideoLayoutBackground();
        trtcVideoLayoutParams.rects = new ArrayList<>();
    }

    public static String h(TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13f29ebb", new Object[]{trtcVideoLayoutParams});
        }
        StringBuilder sb = new StringBuilder("{ sub video size: ");
        sb.append(trtcVideoLayoutParams.subWidth);
        sb.append("x");
        sb.append(trtcVideoLayoutParams.subHeight);
        sb.append(" | background type: ");
        if (trtcVideoLayoutParams.backgroundInfo.bType == 0) {
            sb.append("color, rgb: ");
            sb.append(trtcVideoLayoutParams.backgroundInfo.bR);
            sb.append("-");
            sb.append(trtcVideoLayoutParams.backgroundInfo.bG);
            sb.append("-");
            sb.append(trtcVideoLayoutParams.backgroundInfo.bB);
        } else {
            sb.append("image, type: ");
            if (trtcVideoLayoutParams.backgroundInfo.bImageType == 0) {
                str = "local";
            } else {
                str = "server";
            }
            sb.append(str);
            sb.append(", url: ");
            sb.append(trtcVideoLayoutParams.backgroundInfo.bImageUrl);
        }
        sb.append(", background size: ");
        sb.append(trtcVideoLayoutParams.backgroundInfo.bWidth);
        sb.append("x");
        sb.append(trtcVideoLayoutParams.backgroundInfo.bHeight);
        sb.append(", vect list: |");
        Iterator<TrtcInnerDefines.TrtcVideoLayoutRect> it = trtcVideoLayoutParams.rects.iterator();
        while (it.hasNext()) {
            TrtcInnerDefines.TrtcVideoLayoutRect next = it.next();
            sb.append("userId: ");
            sb.append(next.userId);
            sb.append(", ");
            sb.append(next.xPos);
            sb.append("-");
            sb.append(next.yPos);
            sb.append("-");
            sb.append(next.zPos);
            sb.append(" ");
            sb.append(next.width);
            sb.append("x");
            sb.append(next.height);
            sb.append(" | ");
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // com.taobao.trtc.api.b
    public b a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("adc3897a", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (!(i == 0 || i2 == 0)) {
            TrtcInnerDefines.TrtcVideoLayoutBackground trtcVideoLayoutBackground = this.b.backgroundInfo;
            trtcVideoLayoutBackground.bWidth = i;
            trtcVideoLayoutBackground.bHeight = i2;
        }
        return this;
    }

    @Override // com.taobao.trtc.api.b
    public b b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("97fcc46d", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams = this.b;
        trtcVideoLayoutParams.subWidth = i;
        trtcVideoLayoutParams.subHeight = i2;
        return this;
    }

    @Override // com.taobao.trtc.api.b
    public b c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f47c7060", new Object[]{this, new Integer(i)});
        }
        TrtcInnerDefines.TrtcVideoLayoutBackground trtcVideoLayoutBackground = this.b.backgroundInfo;
        trtcVideoLayoutBackground.bType = i;
        String str = trtcVideoLayoutBackground.bImageUrl;
        if (str == null || (str != null && str.isEmpty())) {
            this.b.backgroundInfo.bType = 0;
        }
        return this;
    }

    @Override // com.taobao.trtc.api.b
    public b d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b1db1824", new Object[]{this, str});
        }
        this.b.extension = str;
        return this;
    }

    @Override // com.taobao.trtc.api.b
    public b e(TrtcDefines.TrtcBackgroundImageType trtcBackgroundImageType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d2076cfd", new Object[]{this, trtcBackgroundImageType, str});
        }
        TrtcInnerDefines.TrtcVideoLayoutBackground trtcVideoLayoutBackground = this.b.backgroundInfo;
        trtcVideoLayoutBackground.bType = 1;
        trtcVideoLayoutBackground.bImageType = trtcBackgroundImageType.ordinal();
        TrtcInnerDefines.TrtcVideoLayoutBackground trtcVideoLayoutBackground2 = this.b.backgroundInfo;
        if (str == null) {
            str = "";
        }
        trtcVideoLayoutBackground2.bImageUrl = str;
        return this;
    }

    @Override // com.taobao.trtc.api.b
    public b g(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("41a42a89", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        TrtcInnerDefines.TrtcVideoLayoutBackground trtcVideoLayoutBackground = this.b.backgroundInfo;
        trtcVideoLayoutBackground.bType = 0;
        trtcVideoLayoutBackground.bR = i;
        trtcVideoLayoutBackground.bG = i2;
        trtcVideoLayoutBackground.bB = i3;
        return this;
    }

    @Override // com.taobao.trtc.api.b
    public boolean start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("810347ed", new Object[]{this})).booleanValue();
        }
        if (!this.b.rects.isEmpty()) {
            return this.f13948a.s1(this.b);
        }
        TrtcLog.i("TrtcVideoLayoutImpl", "set video layout error for rect is empty");
        return false;
    }

    @Override // com.taobao.trtc.api.b
    public b f(int i, int i2, int i3, int i4, int i5, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("bbc46872", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), str});
        }
        if (str.isEmpty() || i4 == 0 || i5 == 0) {
            TrtcLog.i("TrtcVideoLayoutImpl", "set rect error for var invalid");
            z = false;
        }
        Iterator<TrtcInnerDefines.TrtcVideoLayoutRect> it = this.b.rects.iterator();
        while (it.hasNext()) {
            if (it.next().userId.equals(str)) {
                TrtcLog.i("TrtcVideoLayoutImpl", "set rect error for: uid: " + str + " rect exist");
                z = false;
            }
        }
        if (z) {
            TrtcInnerDefines.TrtcVideoLayoutRect trtcVideoLayoutRect = new TrtcInnerDefines.TrtcVideoLayoutRect();
            trtcVideoLayoutRect.xPos = i;
            trtcVideoLayoutRect.yPos = i2;
            trtcVideoLayoutRect.zPos = i3;
            trtcVideoLayoutRect.width = i4;
            trtcVideoLayoutRect.height = i5;
            trtcVideoLayoutRect.userId = str;
            this.b.rects.add(trtcVideoLayoutRect);
        }
        return this;
    }
}

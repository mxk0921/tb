package com.flybird;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.uc.webview.export.media.CommandID;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBVideo extends FBView implements BirdNestEngine.UiVideoProvider.VideoCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BirdNestEngine.UiVideoProvider A;
    public HashMap<String, String> B = new HashMap<>();

    public FBVideo(Context context, FBDocument fBDocument) {
        super(fBDocument);
        BirdNestEngine.UiVideoProvider uiVideoProvider = this.mDoc.getEngine().getConfig().getUiVideoProvider();
        this.A = uiVideoProvider;
        FrameLayout.LayoutParams layoutParams = this.v;
        layoutParams.width = -1;
        layoutParams.height = -1;
        setInnerView(uiVideoProvider.createVideoView(context, this));
    }

    public static /* synthetic */ Object ipc$super(FBVideo fBVideo, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case 190242413:
                return super.invoke((String) objArr[0], (String) objArr[1]);
            case 1244158581:
                super.updateAttr((String) objArr[0], (String) objArr[1]);
                return null;
            case 1852014070:
                super.doDestroy();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/FBVideo");
        }
    }

    @Override // com.flybird.FBView
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        try {
            this.A.destroyVideoView(this.mView);
            super.doDestroy();
        } catch (Throwable th) {
            FBLogger.e(FBView.TAG, th);
        }
    }

    @Override // com.flybird.FBView
    public String invoke(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b56de6d", new Object[]{this, str, str2});
        }
        if (CommandID.getCurrentPosition.equals(str)) {
            return String.valueOf(this.A.getAttribute(getInnerView(), "currentPosition"));
        }
        if (!"paused".equals(str)) {
            return super.invoke(str, str2);
        }
        if (((Boolean) this.A.getAttribute(getInnerView(), "paused")).booleanValue()) {
            return "true";
        }
        return "false";
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7313c222", new Object[]{this});
        } else if (!isDestroyed()) {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "completed");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onError(int i, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4819ff39", new Object[]{this, new Integer(i), str, obj});
        } else if (!isDestroyed()) {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "error, code: " + i + ", desc: " + str + ", extra: " + obj);
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        } else if (!isDestroyed()) {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "finished");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad91656", new Object[]{this});
        } else if (!isDestroyed()) {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "playing");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (!isDestroyed()) {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "started");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onUserAction(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce5133b", new Object[]{this, str, str2});
        } else if (!isDestroyed()) {
            FBDocument.a(this.mDoc, getNode(), "onuseraction", str2);
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onViewClicked(Point point, Point point2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5813b0", new Object[]{this, point, point2});
        } else {
            super.onClick(null);
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void playerBuffering() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3e89c8", new Object[]{this});
        } else if (!isDestroyed()) {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "playerBuffering");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void playerBufferingEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf426e1", new Object[]{this});
        } else if (!isDestroyed()) {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "playerBufferingEnd");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void playerPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46ee876", new Object[]{this});
        } else if (!isDestroyed()) {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "paused");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void playerSeekComplete(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d74b11b", new Object[]{this, new Boolean(z)});
        } else if (!isDestroyed()) {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "playerSeekComplete");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void playerSeeking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdc0fc50", new Object[]{this});
        } else if (!isDestroyed()) {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "playerSeeking");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void playerStopped() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e68e33", new Object[]{this});
        } else if (!isDestroyed()) {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", DXRecyclerLayout.LOAD_MORE_STOPED);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r8.equals("behaviorInfo") == false) goto L_0x002d;
     */
    @Override // com.flybird.FBView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateAttr(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = com.flybird.FBVideo.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "4a285a75"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            r3[r1] = r8
            r3[r0] = r9
            r4.ipc$dispatch(r5, r3)
            return
        L_0x0018:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r7.B
            r4.put(r8, r9)
            android.view.View r4 = r7.getInnerView()
            if (r8 != 0) goto L_0x0025
            java.lang.String r8 = ""
        L_0x0025:
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case 114148: goto L_0x0050;
                case 109757585: goto L_0x0044;
                case 1946948128: goto L_0x003b;
                case 2045330211: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            r0 = -1
            goto L_0x005b
        L_0x002f:
            java.lang.String r0 = "mutewhenstartplay"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0039
            goto L_0x002d
        L_0x0039:
            r0 = 3
            goto L_0x005b
        L_0x003b:
            java.lang.String r1 = "behaviorInfo"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x005b
            goto L_0x002d
        L_0x0044:
            java.lang.String r0 = "state"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x004e
            goto L_0x002d
        L_0x004e:
            r0 = 1
            goto L_0x005b
        L_0x0050:
            java.lang.String r0 = "src"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x005a
            goto L_0x002d
        L_0x005a:
            r0 = 0
        L_0x005b:
            switch(r0) {
                case 0: goto L_0x0099;
                case 1: goto L_0x0073;
                case 2: goto L_0x0069;
                case 3: goto L_0x0069;
                default: goto L_0x005e;
            }
        L_0x005e:
            super.updateAttr(r8, r9)
            com.alipay.birdnest.api.BirdNestEngine$UiVideoProvider r8 = r7.A
            java.util.HashMap<java.lang.String, java.lang.String> r9 = r7.B
            r8.loadUri(r4, r9)
            goto L_0x00c3
        L_0x0069:
            com.alipay.birdnest.api.BirdNestEngine$UiVideoProvider r0 = r7.A
            android.view.View r1 = r7.getInnerView()
            r0.setAttribute(r1, r8, r9)
            goto L_0x00c3
        L_0x0073:
            java.lang.String r8 = "pause"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0086
            com.alipay.birdnest.api.BirdNestEngine$UiVideoProvider r8 = r7.A
            android.view.View r9 = r7.getInnerView()
            r8.pause(r9)
            goto L_0x00c3
        L_0x0086:
            java.lang.String r8 = "resume"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00c3
            com.alipay.birdnest.api.BirdNestEngine$UiVideoProvider r8 = r7.A
            android.view.View r9 = r7.getInnerView()
            r8.resume(r9)
            goto L_0x00c3
        L_0x0099:
            com.alipay.birdnest.api.BirdNestEngine$UiVideoProvider r8 = r7.A
            java.util.HashMap<java.lang.String, java.lang.String> r9 = r7.B
            r8.loadUri(r4, r9)
            com.flybird.FBDocument r8 = r7.mDoc
            r8.getClass()
            java.util.HashMap<java.lang.String, java.lang.String> r8 = r7.B
            java.lang.String r9 = "autoplay"
            java.lang.Object r8 = r8.get(r9)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.String r9 = "true"
            boolean r8 = android.text.TextUtils.equals(r8, r9)
            if (r8 != 0) goto L_0x00be
            com.alipay.birdnest.api.BirdNestEngine$UiVideoProvider r8 = r7.A
            r8.prepare(r4)
            goto L_0x00c3
        L_0x00be:
            com.alipay.birdnest.api.BirdNestEngine$UiVideoProvider r8 = r7.A
            r8.play(r4)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBVideo.updateAttr(java.lang.String, java.lang.String):void");
    }
}

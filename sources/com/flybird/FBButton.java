package com.flybird;

import android.content.Context;
import android.widget.Button;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBButton extends FBLabel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String[] M = new String[3];
    public Button N;

    public FBButton(Context context, FBDocument fBDocument) {
        super(context, new FBBorderButton(context), fBDocument);
        Button button = (Button) getInnerView();
        this.N = button;
        button.setGravity(17);
        this.N.setBackgroundDrawable(null);
    }

    public static /* synthetic */ Object ipc$super(FBButton fBButton, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1022301035) {
            super.updateCSS((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 1852014070) {
            super.doDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/flybird/FBButton");
        }
    }

    @Override // com.flybird.FBLabel
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.flybird.FBLabel, com.flybird.FBView
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        super.doDestroy();
        this.M = null;
        this.N = null;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        String[] strArr = this.M;
        if (strArr[1] == null && strArr[2] == null) {
            this.N.setTextColor(FBTools.parseColor(strArr[0], FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping));
        } else {
            this.N.setTextColor(FBTools.genTextSelector(strArr, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r8.equals("color") == false) goto L_0x002c;
     */
    @Override // com.flybird.FBLabel, com.flybird.FBView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateCSS(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = com.flybird.FBButton.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "c310ec95"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r7
            r0[r2] = r8
            r0[r1] = r9
            r4.ipc$dispatch(r5, r0)
            return
        L_0x0018:
            if (r8 == 0) goto L_0x00a2
            boolean r4 = r7.isDestroyed()
            if (r4 == 0) goto L_0x0022
            goto L_0x00a2
        L_0x0022:
            java.lang.String r4 = "CSS"
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1586082113: goto L_0x0058;
                case -886884611: goto L_0x004d;
                case 34328755: goto L_0x0042;
                case 94842723: goto L_0x0039;
                case 598800822: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = -1
            goto L_0x0062
        L_0x002e:
            java.lang.String r0 = "font-weight"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0037
            goto L_0x002c
        L_0x0037:
            r0 = 4
            goto L_0x0062
        L_0x0039:
            java.lang.String r6 = "color"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L_0x0062
            goto L_0x002c
        L_0x0042:
            java.lang.String r0 = "color:disabled"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x004b
            goto L_0x002c
        L_0x004b:
            r0 = 2
            goto L_0x0062
        L_0x004d:
            java.lang.String r0 = "color:active"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0056:
            r0 = 1
            goto L_0x0062
        L_0x0058:
            java.lang.String r0 = "font-size"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0061
            goto L_0x002c
        L_0x0061:
            r0 = 0
        L_0x0062:
            switch(r0) {
                case 0: goto L_0x0097;
                case 1: goto L_0x008c;
                case 2: goto L_0x0084;
                case 3: goto L_0x0079;
                case 4: goto L_0x0069;
                default: goto L_0x0065;
            }
        L_0x0065:
            super.updateCSS(r8, r9)
            goto L_0x00a2
        L_0x0069:
            android.widget.Button r8 = r7.N
            android.text.TextPaint r8 = r8.getPaint()
            java.lang.String r0 = "bold"
            boolean r9 = r0.equals(r9)
            r8.setFakeBoldText(r9)
            goto L_0x00a2
        L_0x0079:
            r7.putThemeModeAssociatedActions(r4, r8, r9)
            java.lang.String[] r8 = r7.M
            r8[r3] = r9
            r7.g()
            goto L_0x00a2
        L_0x0084:
            java.lang.String[] r8 = r7.M
            r8[r1] = r9
            r7.g()
            goto L_0x00a2
        L_0x008c:
            r7.putThemeModeAssociatedActions(r4, r8, r9)
            java.lang.String[] r8 = r7.M
            r8[r2] = r9
            r7.g()
            goto L_0x00a2
        L_0x0097:
            float r8 = com.flybird.FBView.parseFontSize(r9)
            android.widget.Button r9 = r7.N
            int r0 = com.alipay.birdnest.platform.Platform.f
            r9.setTextSize(r0, r8)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBButton.updateCSS(java.lang.String, java.lang.String):void");
    }
}

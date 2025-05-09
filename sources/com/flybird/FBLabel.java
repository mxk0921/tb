package com.flybird;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.alipay.android.app.template.HtmlLite;
import com.alipay.android.app.template.LogCatLog;
import com.alipay.birdnest.util.FBLabelSpanUtil$ClickMoreListener;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBLabel extends FBView implements HtmlLite.UrlSpanFactory, FBLabelSpanUtil$ClickMoreListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView A;
    public boolean B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class MyURLSpan extends URLSpan {
        public MyURLSpan(String str) {
            super(str);
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public void onClick(View view) {
            if (!FBLabel.this.isDestroyed()) {
                try {
                    Selection.setSelection((Spannable) ((FBBorderText) view).getText(), 0, 0);
                } catch (ClassCastException e) {
                    FBLogger.e("FBLabel", e);
                }
                if (!FBView.nativePlatformInvokeCallback(FBLabel.this.mNode, "onlink", getURL())) {
                    try {
                        FBLabel.this.getFBDocument().openUrl(getURL());
                    } catch (Throwable th) {
                        super.onClick(view);
                        LogCatLog.e("FBLabel", th);
                    }
                }
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public FBLabel(Context context, View view, FBDocument fBDocument) {
        super(context, view == null ? a(context) : view, fBDocument);
        this.C = "";
        this.D = "";
        this.E = "";
        this.F = "";
        this.G = "";
        this.H = "";
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = Color.parseColor("#333333");
        TextView textView = (TextView) this.mView;
        this.A = textView;
        this.B = textView instanceof FBBorderText;
        textView.setGravity(16);
        this.A.setTextColor(this.L);
    }

    public static TextView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("56ecd4", new Object[]{context});
        }
        return new FBBorderText(context);
    }

    public static /* synthetic */ Object ipc$super(FBLabel fBLabel, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1305055009:
                super.onLoadFinish();
                return null;
            case -1022301035:
                super.updateCSS((String) objArr[0], (String) objArr[1]);
                return null;
            case 663633004:
                super.updateEvent((String) objArr[0], (String) objArr[1]);
                return null;
            case 1244158581:
                super.updateAttr((String) objArr[0], (String) objArr[1]);
                return null;
            case 1852014070:
                super.doDestroy();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/FBLabel");
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        this.I = z;
        if (this.B) {
            FBBorderText fBBorderText = (FBBorderText) this.A;
            fBBorderText.setSupportEmoji(z);
            fBBorderText.setEmojiProvider(this.mDoc.getEngine().getConfig().getEmojiProvider());
        }
    }

    @Override // com.alipay.android.app.template.HtmlLite.UrlSpanFactory
    public URLSpan createInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URLSpan) ipChange.ipc$dispatch("9360f5ca", new Object[]{this, str});
        }
        return new MyURLSpan(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Unknown variable types count: 3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009d -> B:37:0x00b9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a8 -> B:37:0x00b9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.flybird.FBLabel.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "596b2eb"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r11
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            boolean r2 = r11.I
            r11.c(r2)
            java.lang.String r2 = r11.H
            boolean r3 = r11.I
            if (r3 == 0) goto L_0x0031
            android.widget.TextView r3 = r11.A
            boolean r4 = r3 instanceof com.alipay.birdnest.view.TextViewWrapper
            if (r4 == 0) goto L_0x0031
            com.alipay.birdnest.view.TextViewWrapper r3 = (com.alipay.birdnest.view.TextViewWrapper) r3
            boolean r4 = r3.f3837a
            if (r4 == 0) goto L_0x0031
            if (r2 == 0) goto L_0x0031
            com.alipay.birdnest.api.BirdNestEngine$EmojiProvider r3 = r3.e
            java.lang.String r2 = r3.prepareContent(r2)
        L_0x0031:
            java.lang.String r3 = "<font "
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x003f
            boolean r3 = com.alipay.android.app.template.HtmlLite.hasHtmlEntityChar(r2)
            if (r3 == 0) goto L_0x0040
        L_0x003f:
            r0 = 1
        L_0x0040:
            java.lang.String r1 = "<a "
            boolean r1 = r2.contains(r1)
            r10 = 0
            if (r0 != 0) goto L_0x0052
            if (r1 == 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            android.widget.TextView r0 = r11.A
            r0.setText(r2)
            goto L_0x00b9
        L_0x0052:
            com.flybird.FBDocument r0 = r11.mDoc     // Catch: all -> 0x0082
            android.content.Context r3 = r0.k     // Catch: all -> 0x0082
            float r4 = com.flybird.FBDocumentAssistor.getDp()     // Catch: all -> 0x0082
            com.flybird.FBDocument r0 = r11.mDoc     // Catch: all -> 0x0082
            com.alipay.birdnest.api.BirdNestEngine$ThemeColorProvider r7 = com.flybird.FBDocumentAssistor.c(r0)     // Catch: all -> 0x0082
            com.flybird.FBDocument r0 = r11.mDoc     // Catch: all -> 0x0082
            int r8 = com.flybird.FBDocumentAssistor.b(r0)     // Catch: all -> 0x0082
            boolean r9 = r11.themeModeUseColorMapping     // Catch: all -> 0x0082
            r5 = r2
            r6 = r11
            android.text.SpannableStringBuilder r10 = com.alipay.android.app.template.HtmlLite.fromHtml(r3, r4, r5, r6, r7, r8, r9)     // Catch: all -> 0x0082
            if (r1 == 0) goto L_0x0084
            android.widget.TextView r0 = r11.A     // Catch: all -> 0x0082
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()     // Catch: all -> 0x0082
            r0.setMovementMethod(r1)     // Catch: all -> 0x0082
            android.widget.TextView r0 = r11.A     // Catch: all -> 0x0082
            r0.setText(r10)     // Catch: all -> 0x0082
            r11.updateA12yNodeInfo()     // Catch: all -> 0x0082
            goto L_0x00b9
        L_0x0082:
            r0 = move-exception
            goto L_0x008a
        L_0x0084:
            android.widget.TextView r0 = r11.A     // Catch: all -> 0x0082
            r0.setText(r10)     // Catch: all -> 0x0082
            goto L_0x00b9
        L_0x008a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "HtmlLite.fromHtml exception:"
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "FBLabel"
            com.alipay.birdnest.util.FBLogger.e(r1, r0)
            android.widget.TextView r0 = r11.A     // Catch: all -> 0x00a7
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)     // Catch: all -> 0x00a7
            r0.setText(r2)     // Catch: all -> 0x00a7
            goto L_0x00b9
        L_0x00a7:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "com.alipay.tag.html.Html.fromHtml exception:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.alipay.birdnest.util.FBLogger.e(r1, r0)
        L_0x00b9:
            boolean r0 = r11.K
            if (r0 == 0) goto L_0x00c4
            android.widget.TextView r0 = r11.A
            java.lang.String r1 = r11.H
            com.alipay.birdnest.platform.ConnectionUtils.a(r0, r1, r10, r11)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBLabel.d():void");
    }

    @Override // com.flybird.FBView
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        super.doDestroy();
        this.mDoc = null;
        this.A = null;
        this.B = false;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.F.equals("vertical") && this.G.equals("-webkit-box")) {
            if (this.E.length() > 0) {
                this.A.setMaxLines(Integer.parseInt(this.E));
                this.A.setEllipsize(TextUtils.TruncateAt.END);
                return;
            }
            this.A.setMaxLines(100000);
            this.A.setEllipsize(null);
        }
    }

    @Override // com.flybird.FBView
    public void onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23670df", new Object[]{this});
        } else if (!isDestroyed()) {
            super.onLoadFinish();
            d();
            if (this.mTag.equals("marquee")) {
                this.A.postDelayed(new Runnable() { // from class: com.flybird.FBLabel.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (FBLabel.this.mDoc != null && FBLabel.this.mDoc.k != null) {
                            FBLabel fBLabel = FBLabel.this;
                            if (fBLabel.A == null) {
                                return;
                            }
                            if (!(fBLabel.mDoc.k instanceof Activity) || !((Activity) FBLabel.this.mDoc.k).isFinishing()) {
                                TextView textView = FBLabel.this.A;
                                if (textView instanceof FBBorderText) {
                                    ((FBBorderText) textView).setForceFocus(true);
                                }
                                FBLabel.this.A.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                                FBLabel.this.A.setSelected(true);
                                FBLabel.this.A.setFocusable(true);
                                FBLabel.this.A.setGravity(19);
                                FBLabel.this.A.setHorizontallyScrolling(true);
                                FBLabel.this.A.setFocusableInTouchMode(true);
                                FBLabel.this.A.setMarqueeRepeatLimit(-1);
                                FBLabel.this.A.requestFocus();
                            }
                        }
                    }
                }, 100L);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
        if (r9.equals("selectable") == false) goto L_0x002e;
     */
    @Override // com.flybird.FBView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateCSS(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBLabel.updateCSS(java.lang.String, java.lang.String):void");
    }

    @Override // com.flybird.FBView
    public void updateEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278e3c6c", new Object[]{this, str, str2});
            return;
        }
        super.updateEvent(str, str2);
        if (this.mDoc != null && str.equals("event") && str2 != null && str2.equals("onclickmore") && (this.mView instanceof FBBorderText)) {
            FBView.nativePlatformValidateEvent(this.mNode, str2);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.D.equals("hidden")) {
        } else {
            if (this.C.equals("ellipsis")) {
                this.A.setEllipsize(TextUtils.TruncateAt.END);
            } else if (this.C.equals("marquee")) {
                TextView textView = this.A;
                if (textView instanceof FBBorderText) {
                    ((FBBorderText) textView).setForceFocus(true);
                }
                this.A.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                this.A.setSelected(true);
                this.A.setFocusable(true);
                this.A.setGravity(19);
                this.A.setHorizontallyScrolling(true);
                this.A.setMarqueeRepeatLimit(-1);
                this.A.setFocusableInTouchMode(true);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r7.equals("highlightcolor") == false) goto L_0x0029;
     */
    @Override // com.flybird.FBView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateAttr(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.flybird.FBLabel.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "4a285a75"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r3.ipc$dispatch(r4, r5)
            return
        L_0x0018:
            super.updateAttr(r7, r8)
            if (r7 != 0) goto L_0x001e
            return
        L_0x001e:
            java.lang.String r3 = "prop"
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case 3556653: goto L_0x0040;
                case 96632902: goto L_0x0035;
                case 520188719: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r0 = -1
            goto L_0x004b
        L_0x002b:
            java.lang.String r1 = "highlightcolor"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x004b
            goto L_0x0029
        L_0x0035:
            java.lang.String r0 = "emoji"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x003e
            goto L_0x0029
        L_0x003e:
            r0 = 1
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "text"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x004a
            goto L_0x0029
        L_0x004a:
            r0 = 0
        L_0x004b:
            switch(r0) {
                case 0: goto L_0x0074;
                case 1: goto L_0x006d;
                case 2: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x008a
        L_0x004f:
            r6.putThemeModeAssociatedActions(r3, r7, r8)
            android.widget.TextView r7 = r6.A
            if (r7 == 0) goto L_0x008a
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 != 0) goto L_0x008a
            android.widget.TextView r7 = r6.A     // Catch: all -> 0x0066
            int r8 = android.graphics.Color.parseColor(r8)     // Catch: all -> 0x0066
            r7.setHighlightColor(r8)     // Catch: all -> 0x0066
            goto L_0x008a
        L_0x0066:
            r7 = move-exception
            java.lang.String r8 = "FBLabel"
            com.alipay.birdnest.util.FBLogger.e(r8, r7)
            goto L_0x008a
        L_0x006d:
            boolean r7 = java.lang.Boolean.parseBoolean(r8)
            r6.I = r7
            goto L_0x008a
        L_0x0074:
            r6.putThemeModeAssociatedActions(r3, r7, r8)
            com.android.alibaba.ip.runtime.IpChange r7 = com.alipay.birdnest.platform.Platform.$ipChange
            r6.H = r8
            com.flybird.FBDocument r7 = r6.mDoc
            if (r7 == 0) goto L_0x008a
            com.flybird.FBDocument r7 = r6.mDoc
            boolean r7 = r7.isOnloadFinish()
            if (r7 == 0) goto L_0x008a
            r6.d()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBLabel.updateAttr(java.lang.String, java.lang.String):void");
    }
}

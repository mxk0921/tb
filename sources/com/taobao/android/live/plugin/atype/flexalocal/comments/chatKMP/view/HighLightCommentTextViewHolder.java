package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.highlightcomment.SwitchData;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.HighLightCommentTextViewHolder;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.fzf;
import tb.kiv;
import tb.kjy;
import tb.niy;
import tb.nw0;
import tb.o3s;
import tb.qjy;
import tb.sjr;
import tb.t2o;
import tb.t54;
import tb.tws;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.vaj;
import tb.vc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HighLightCommentTextViewHolder extends MultiLineTextViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final LinearLayout W;
    public final TUrlImageView X;
    public final TextView Y;
    public final TUrlImageView Z;
    public final LinearLayout a0;
    public final View b0;
    public final ux9 c0;
    public TBLiveDataModel d0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements niy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBLiveDataModel f8438a;

        public a(TBLiveDataModel tBLiveDataModel) {
            this.f8438a = tBLiveDataModel;
        }

        @Override // tb.niy
        public void a(SwitchData switchData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efd14f7", new Object[]{this, switchData});
            } else if (switchData == null) {
            } else {
                if (switchData.canSend.booleanValue()) {
                    sjr.g().c(uyg.EVENT_INPUT_SHOW, null, null);
                } else {
                    HighLightCommentTextViewHolder.b(HighLightCommentTextViewHolder.this, switchData, this.f8438a);
                }
            }
        }
    }

    static {
        t2o.a(295698695);
    }

    public HighLightCommentTextViewHolder(View view, ux9 ux9Var) {
        super(view, ux9Var);
        this.W = (LinearLayout) view.findViewById(R.id.taolive_chat_item_bubble);
        this.X = (TUrlImageView) view.findViewById(R.id.taolive_highlight_icon);
        this.Y = (TextView) view.findViewById(R.id.taolive_highlight_footer);
        this.Z = (TUrlImageView) view.findViewById(R.id.taolive_highlight_footer_arrow);
        this.a0 = (LinearLayout) view.findViewById(R.id.taolive_highlight_footer_container);
        this.b0 = view.findViewById(R.id.divider_line);
        this.c0 = ux9Var;
    }

    public static /* synthetic */ void b(HighLightCommentTextViewHolder highLightCommentTextViewHolder, SwitchData switchData, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a8969", new Object[]{highLightCommentTextViewHolder, switchData, tBLiveDataModel});
        } else {
            highLightCommentTextViewHolder.e(switchData, tBLiveDataModel);
        }
    }

    public static /* synthetic */ Object ipc$super(HighLightCommentTextViewHolder highLightCommentTextViewHolder, String str, Object... objArr) {
        if (str.hashCode() == -815397012) {
            super.b0((fzf) objArr[0], (TBLiveDataModel) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/view/HighLightCommentTextViewHolder");
    }

    public final void c(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f646ed", new Object[]{this, taoLiveKtCommentEntity});
        } else if (taoLiveKtCommentEntity != null && taoLiveKtCommentEntity.getFavorHighlightCommentStyle() != null) {
            Map<String, Object> favorHighlightCommentStyle = taoLiveKtCommentEntity.getFavorHighlightCommentStyle();
            if ((favorHighlightCommentStyle.get("borderColor") instanceof String) && (favorHighlightCommentStyle.get(vaj.KEY_BG_COLOR) instanceof String)) {
                String str = (String) favorHighlightCommentStyle.get("borderColor");
                String str2 = (String) favorHighlightCommentStyle.get(vaj.KEY_BG_COLOR);
                Drawable mutate = c0().mutate();
                if (mutate instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) mutate;
                    if (str2 == null) {
                        str2 = "#FFFFFF";
                    }
                    gradientDrawable.setColor(Color.parseColor(str2));
                    int d = nw0.d(this.W.getContext(), 1.0f);
                    if (str == null) {
                        str = "#000000";
                    }
                    gradientDrawable.setStroke(d, Color.parseColor(str));
                    gradientDrawable.setCornerRadius(nw0.d(this.W.getContext(), 6.0f));
                    this.W.setBackground(gradientDrawable);
                }
            }
        }
    }

    public final void d(TBLiveDataModel tBLiveDataModel, TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c70a08", new Object[]{this, tBLiveDataModel, taoLiveKtCommentEntity});
        } else if (taoLiveKtCommentEntity != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("commentId", taoLiveKtCommentEntity.getCommentId());
            qjy.d("ArrestComment", hashMap);
            kjy.e().d(new a(tBLiveDataModel), new WeakReference<>(this.itemView));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r4.equals("FREQUENCY_LIMIT") == false) goto L_0x0025;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.highlightcomment.SwitchData r8, com.taobao.taolive.sdk.model.TBLiveDataModel r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.HighLightCommentTextViewHolder.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "f1103a79"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            r3[r1] = r8
            r3[r0] = r9
            r4.ipc$dispatch(r5, r3)
            return
        L_0x0018:
            java.lang.String r4 = r8.reasonType
            r4.hashCode()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -1986035843: goto L_0x0046;
                case 834559843: goto L_0x003b;
                case 1384869592: goto L_0x0032;
                case 1488377839: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            r0 = -1
            goto L_0x0050
        L_0x0027:
            java.lang.String r0 = "NO_FOLLOW"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0030
            goto L_0x0025
        L_0x0030:
            r0 = 3
            goto L_0x0050
        L_0x0032:
            java.lang.String r1 = "FREQUENCY_LIMIT"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0050
            goto L_0x0025
        L_0x003b:
            java.lang.String r0 = "NO_FANS_LEVEL"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0044
            goto L_0x0025
        L_0x0044:
            r0 = 1
            goto L_0x0050
        L_0x0046:
            java.lang.String r0 = "NO_FAV"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x004f
            goto L_0x0025
        L_0x004f:
            r0 = 0
        L_0x0050:
            switch(r0) {
                case 0: goto L_0x006a;
                case 1: goto L_0x005f;
                case 2: goto L_0x0054;
                case 3: goto L_0x006a;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0073
        L_0x0054:
            tb.sjr r8 = tb.sjr.g()
            java.lang.String r9 = "com.taobao.taolive.room.input_show"
            r0 = 0
            r8.c(r9, r0, r0)
            goto L_0x0073
        L_0x005f:
            r7.j()
            android.content.Context r9 = r7.f8434a
            java.lang.String r8 = r8.reason
            tb.a1u.a(r9, r8)
            goto L_0x0073
        L_0x006a:
            tb.kjy r0 = tb.kjy.e()
            android.content.Context r1 = r7.f8434a
            r0.j(r1, r9, r8)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.HighLightCommentTextViewHolder.e(com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.highlightcomment.SwitchData, com.taobao.taolive.sdk.model.TBLiveDataModel):void");
    }

    public final boolean g() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39087dbc", new Object[]{this})).booleanValue();
        }
        TBLiveDataModel tBLiveDataModel = this.d0;
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || !"2".equals(videoInfo.roomStatus)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void h(TBLiveDataModel tBLiveDataModel, TaoLiveKtCommentEntity taoLiveKtCommentEntity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb27cae", new Object[]{this, tBLiveDataModel, taoLiveKtCommentEntity, view});
        } else if (v2s.o().u() == null) {
        } else {
            if (v2s.o().u().checkSessionValid()) {
                d(tBLiveDataModel, taoLiveKtCommentEntity);
            } else if (this.f8434a instanceof Activity) {
                v2s.o().u().a((Activity) this.f8434a, null);
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.MultiLineTextViewHolder, com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.BaseItemViewHolder
    public void b0(fzf fzfVar, final TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf66076c", new Object[]{this, fzfVar, tBLiveDataModel});
            return;
        }
        super.b0(fzfVar, tBLiveDataModel);
        this.d0 = tBLiveDataModel;
        final TaoLiveKtCommentEntity taoLiveKtCommentEntity = fzfVar.f19644a;
        if (taoLiveKtCommentEntity == null || taoLiveKtCommentEntity.getFavorHighlightCommentStyle() == null) {
            o3s.b("HighLightCommentTextViewHolder", "Invalid entity or style");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("commentId", taoLiveKtCommentEntity.getCommentId());
        qjy.e("ArrestComment", hashMap);
        c(taoLiveKtCommentEntity);
        Map<String, Object> favorHighlightCommentStyle = taoLiveKtCommentEntity.getFavorHighlightCommentStyle();
        this.X.setVisibility(0);
        this.X.setImageUrl((String) favorHighlightCommentStyle.get("icon"));
        this.Z.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01JV0gok296l6BFOCJd_!!6000000008019-2-tps-44-44.png");
        this.a0.setOnClickListener(new View.OnClickListener() { // from class: tb.njy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HighLightCommentTextViewHolder.this.h(tBLiveDataModel, taoLiveKtCommentEntity, view);
            }
        });
        String str = (String) favorHighlightCommentStyle.get("objectiveTips");
        if (TextUtils.isEmpty(str) || g()) {
            this.a0.setVisibility(8);
            this.b0.setVisibility(8);
            this.X.setVisibility(8);
            return;
        }
        this.b0.setVisibility(0);
        this.a0.setVisibility(0);
        this.Y.setText(str);
    }

    public void j() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a1bbc55", new Object[]{this});
        } else if (!vc.a() || vc.i(this.f8434a) || this.f8434a.getResources().getConfiguration().orientation != 2) {
            ux9 ux9Var = this.c0;
            if (ux9Var instanceof t54) {
                IInteractiveProxy.h z0 = ((t54) ux9Var).z0();
                VideoInfo videoInfo = null;
                IInteractiveProxy.f d = z0 != null ? z0.d() : null;
                if (d != null) {
                    HashMap hashMap = new HashMap();
                    TBLiveDataModel tBLiveDataModel = this.d0;
                    if (tBLiveDataModel != null) {
                        videoInfo = tBLiveDataModel.mVideoInfo;
                    }
                    if (videoInfo != null && videoInfo.landScape) {
                        z = true;
                    }
                    hashMap.put("isLandscape", Boolean.valueOf(z));
                    hashMap.put("status", 2);
                    d.a(tws.M(), hashMap);
                }
            }
        } else {
            kiv.c(this.f8434a, "请切换至竖屏状态查看");
        }
    }
}

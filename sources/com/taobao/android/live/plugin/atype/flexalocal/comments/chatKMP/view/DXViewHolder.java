package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.Map;
import tb.d9m;
import tb.fkx;
import tb.fqu;
import tb.fzf;
import tb.hw0;
import tb.ikr;
import tb.liv;
import tb.o3s;
import tb.pb6;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXViewHolder extends BaseItemViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final FrameLayout f;
    public final int g;

    static {
        t2o.a(295698692);
    }

    public DXViewHolder(View view, ux9 ux9Var) {
        super(view, ux9Var);
        this.f = (FrameLayout) view.findViewById(R.id.taolive_chat_root_view);
        Context context = this.f8434a;
        this.g = hw0.t(context, liv.a(context));
    }

    public static /* synthetic */ Object ipc$super(DXViewHolder dXViewHolder, String str, Object... objArr) {
        if (str.hashCode() == -815397012) {
            super.b0((fzf) objArr[0], (TBLiveDataModel) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/view/DXViewHolder");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.BaseItemViewHolder
    public void b0(fzf fzfVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf66076c", new Object[]{this, fzfVar, tBLiveDataModel});
            return;
        }
        super.b0(fzfVar, tBLiveDataModel);
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = fzfVar.f19644a;
        if (taoLiveKtCommentEntity == null) {
            o3s.b("DXViewHolder", "model.ktCommentEntity is null");
            return;
        }
        String templateName = taoLiveKtCommentEntity.getTemplateName();
        Map<String, Object> dxData = fzfVar.f19644a.getDxData();
        if (dxData != null) {
            DinamicXEngine e = ikr.f().e();
            Context context = this.f8434a;
            dxData.put("maxWidth", Integer.valueOf(pb6.A(e, context, hw0.b(context, this.g))));
        }
        JSONObject b = fqu.b(dxData);
        o3s.b("DXViewHolder", "dxData = " + fkx.i(b));
        if (TextUtils.isEmpty(templateName)) {
            o3s.b("DXViewHolder", "templateName is empty");
            return;
        }
        if (this.f.getChildCount() > 0 && (this.f.getChildAt(0) instanceof DXRootView)) {
            DXRootView dXRootView = (DXRootView) this.f.getChildAt(0);
            if (dXRootView.getDxTemplateItem().f7343a.equals(templateName)) {
                d9m.n().renderDX(dXRootView, b);
                return;
            }
        }
        DXRootView createDX = d9m.n().createDX(this.f.getContext(), templateName);
        if (createDX != null) {
            this.f.removeAllViews();
            this.f.addView(createDX);
            d9m.n().renderDX(createDX, b);
        }
    }
}

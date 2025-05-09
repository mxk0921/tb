package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.f3c;
import tb.fzf;
import tb.gq0;
import tb.hw0;
import tb.nh4;
import tb.o3s;
import tb.p44;
import tb.t2o;
import tb.t54;
import tb.ux9;
import tb.uyg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EveryBodySayLeftContentViewHolder extends BaseItemViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TextView f;
    public final TUrlImageView g;
    public final LinearLayout h;
    public final SpannableStringBuilder i = new SpannableStringBuilder();
    public int j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fzf f8437a;

        public a(fzf fzfVar) {
            this.f8437a = fzfVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            HashMap hashMap = new HashMap();
            if (this.f8437a.f19644a.getRenders() == null || !"anchor_custom_sticker".equals(this.f8437a.f19644a.getRenders().get("commentType")) || !this.f8437a.f19644a.getRenders().containsKey("stickerId")) {
                hashMap.put("commentType", "addOne");
            } else {
                hashMap.put("stickerId", (String) this.f8437a.f19644a.getRenders().get("stickerId"));
                hashMap.put("commentType", "anchor_custom_sticker");
            }
            hashMap.put("comment_location", "commentplus");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", (Object) this.f8437a.f19644a.getContent());
            jSONObject.put("extendVal", (Object) hashMap);
            f3c h = EveryBodySayLeftContentViewHolder.this.d.h();
            t54 t54Var = EveryBodySayLeftContentViewHolder.this.d;
            h.c(uyg.EVENT_SEND_COMMENT, jSONObject, t54Var == null ? null : t54Var.C());
        }
    }

    static {
        t2o.a(295698693);
    }

    public EveryBodySayLeftContentViewHolder(View view, ux9 ux9Var) {
        super(view, ux9Var);
        this.h = (LinearLayout) view.findViewById(R.id.taolive_everybody_says_container);
        this.f = (TextView) view.findViewById(R.id.taolive_chat_says_cluster_nick_content);
        this.g = (TUrlImageView) view.findViewById(R.id.taolive_chat_says_cluster_add_one);
    }

    public static /* synthetic */ Object ipc$super(EveryBodySayLeftContentViewHolder everyBodySayLeftContentViewHolder, String str, Object... objArr) {
        if (str.hashCode() == -815397012) {
            super.b0((fzf) objArr[0], (TBLiveDataModel) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/view/EveryBodySayLeftContentViewHolder");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.BaseItemViewHolder
    public void b0(fzf fzfVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf66076c", new Object[]{this, fzfVar, tBLiveDataModel});
            return;
        }
        super.b0(fzfVar, tBLiveDataModel);
        this.h.setBackground(c0());
        h0(fzfVar);
    }

    public final void h0(fzf fzfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c2487cd", new Object[]{this, fzfVar});
        } else if (fzfVar.f19644a != null) {
            this.i.clear();
            List<SpannableString> list = fzfVar.b;
            if (list != null && !((ArrayList) list).isEmpty()) {
                Iterator it = ((ArrayList) fzfVar.b).iterator();
                while (it.hasNext()) {
                    this.i.append((CharSequence) ((SpannableString) it.next()));
                }
            }
            g0(fzfVar);
            j0(fzfVar);
        }
    }

    public void i0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67dfc563", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public final void j0(fzf fzfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb19c13", new Object[]{this, fzfVar});
            return;
        }
        this.f.setVisibility(0);
        this.f.setTextColor(gq0.g().getApplication().getResources().getColor(R.color.taolive_chat_follow_text_white));
        this.i.append((CharSequence) " ");
        String str = fzfVar.f19644a.getName() + ": ";
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(e0()), 0, str.length(), 33);
        this.i.append((CharSequence) spannableString);
        List<SpannableString> list = fzfVar.c;
        if (list != null) {
            for (SpannableString spannableString2 : list) {
                this.i.append((CharSequence) spannableString2);
            }
        } else {
            this.i.append((CharSequence) fzfVar.f19644a.getContent());
        }
        this.f.setText(this.i);
        this.f.setMaxWidth(this.j);
        if (nh4.v()) {
            this.f.setMaxLines(2);
            this.f.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public final void g0(fzf fzfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaea34c", new Object[]{this, fzfVar});
        } else if (fzfVar.f19644a.getCriticalModel() != null) {
            if (!fzfVar.f19644a.getCriticalModel().getCloseAddOneComment()) {
                o3s.b("EveryBodySayLeftContentViewHolder", "show add one");
                this.g.setVisibility(0);
                this.g.setImageUrl(p44.e());
                this.g.setOnClickListener(new a(fzfVar));
                return;
            }
            this.g.setVisibility(8);
            this.j += hw0.b(this.f8434a, 25.0f);
        }
    }
}

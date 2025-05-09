package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m1b implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o1b f23715a;

    public m1b(o1b o1bVar) {
        this.f23715a = o1bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        TaoliveSearchHotWords.RightInfo rightInfo;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        o1b o1bVar = this.f23715a;
        if (!o1b.e(o1bVar, o1b.d(o1bVar), "搜索")) {
            StringBuilder sb = new StringBuilder(nvs.m0());
            if (o1b.i(this.f23715a) != null && !TextUtils.isEmpty(o1b.i(this.f23715a).url)) {
                sb = new StringBuilder(o1b.i(this.f23715a).url);
            }
            HashMap hashMap = new HashMap();
            String str7 = "";
            if (o1b.k(this.f23715a) != null) {
                TaoliveSearchHotWords clickItemData = o1b.k(this.f23715a).getClickItemData();
                if (clickItemData != null) {
                    String str8 = clickItemData.utParams;
                    String str9 = clickItemData.source;
                    str2 = clickItemData.url;
                    str3 = clickItemData.type;
                    String str10 = clickItemData.word;
                    rightInfo = clickItemData.rightInfo;
                    str6 = str9;
                    str5 = str8;
                    str7 = str10;
                } else if (o1b.i(this.f23715a) == null || o1b.i(this.f23715a).hotWordsData == null) {
                    str6 = str7;
                    str2 = str6;
                    str3 = str2;
                    rightInfo = null;
                    str5 = str3;
                } else {
                    String str11 = o1b.i(this.f23715a).hotWordsData.utParams;
                    str6 = o1b.i(this.f23715a).hotWordsData.source;
                    String str12 = o1b.i(this.f23715a).hotWordsData.url;
                    String str13 = o1b.i(this.f23715a).hotWordsData.type;
                    String str14 = o1b.i(this.f23715a).hotWordsData.word;
                    rightInfo = o1b.i(this.f23715a).hotWordsData.rightInfo;
                    str5 = str11;
                    str7 = str14;
                    str3 = str13;
                    str2 = str12;
                }
                hashMap.put("query", str7);
                hashMap.put("shaded_word_type", str6);
                hashMap.putAll(ixf.a(str5));
                str4 = str7;
                str = str5;
            } else {
                str4 = str7;
                str3 = str4;
                str2 = str3;
                str = str2;
                rightInfo = null;
            }
            o1b o1bVar2 = this.f23715a;
            o1b.m(o1bVar2, o1b.l(o1bVar2), sb.toString(), str4, str3, str2, rightInfo, str);
            o1b.n(this.f23715a, 0, hashMap);
        }
    }
}

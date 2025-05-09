package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.SearchRequestParams;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s3p extends f6j<SearchRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262616);
    }

    public s3p(SearchRequestParams searchRequestParams) {
        super(searchRequestParams);
    }

    public static /* synthetic */ Object ipc$super(s3p s3pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/navbar/search/search/SearchInfoApiRequestClient");
    }

    @Override // tb.f6j
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return "mtop.relationrecommend.wirelessrecommend.recommend";
    }

    @Override // tb.f6j
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return "2.0";
    }

    @Override // tb.f6j
    public MethodEnum h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MethodEnum) ipChange.ipc$dispatch("2fddf0c4", new Object[]{this});
        }
        return MethodEnum.POST;
    }

    @Override // tb.f6j
    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return "UNIT_GUIDE";
    }
}

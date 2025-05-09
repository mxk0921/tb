package tb;

import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.param.SearchParam;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface m1p<RESULT extends SearchResult, PARAM extends SearchParam, LOCAL extends LocalDataManager> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(String str, SearchResult searchResult);

        String b();
    }

    void addParam(String str, String str2);

    void clearParam(String str);

    String getTrackingName();

    void removeAllParams();

    void removeParam(String str, String str2);

    void setParam(String str, String str2);

    void setParams(Map<String, String> map);
}

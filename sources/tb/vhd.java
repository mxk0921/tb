package tb;

import org.json.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface vhd {
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_ID = "id";
    public static final String KEY_PIC = "pic";
    public static final String KEY_RECORD_EXTRA = "record-extra";
    public static final String KEY_TAG = "record-";
    public static final String KEY_TITLE = "title";
    public static final String KEY_TYPE = "type";
    public static final String KEY_WIDTH = "width";

    void appear();

    void disappear();

    void nav(String str);

    void putExtra(String str, String str2);

    void refresh(JSONArray jSONArray);

    void start();

    void updateRefreshData(JSONArray jSONArray);
}

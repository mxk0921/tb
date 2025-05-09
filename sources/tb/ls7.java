package tb;

import android.graphics.Rect;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.alipay.zoloz.toyger.blob.CryptoManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zlz.toyger.zdoc.ToygerDocBlobConfig;
import com.ap.zlz.toyger.zdoc.ToygerDocInfo;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class ls7 extends BlobManager<ToygerDocInfo> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INFO_DOC_TYPE = "docType";
    public static final String INFO_PAGE_NUMBER = "pageNo";
    public static final String INFO_PIC_SIZE = "picSize";
    public Rect mCropRect;
    public long picSize = 0;

    static {
        t2o.a(245366787);
    }

    public static /* synthetic */ Object ipc$super(ls7 ls7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ap/zlz/toyger/zdoc/DocBlobManager");
    }

    public abstract byte[] generateBlob(List<ToygerDocInfo> list, Map<String, Object> map);

    public String getDocType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab09d81d", new Object[]{this});
        }
        return this.config.docType;
    }

    public byte[] getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("96e2cfad", new Object[]{this});
        }
        return this.crypto.getAESCypher();
    }

    public int getPageNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cfa4a3b", new Object[]{this})).intValue();
        }
        return this.config.pageNo;
    }

    public long getPicSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcbeae70", new Object[]{this})).longValue();
        }
        return this.picSize;
    }

    public abstract boolean isUTF8();

    public void setBlobConfig(ToygerDocBlobConfig toygerDocBlobConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa23907", new Object[]{this, toygerDocBlobConfig});
            return;
        }
        this.config = toygerDocBlobConfig;
        if (this.crypto == null) {
            this.crypto = new CryptoManager(toygerDocBlobConfig.pubkey, true);
        }
    }

    public void setCropRect(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1a695c", new Object[]{this, rect});
            return;
        }
        int width = (int) ((rect.width() * 0.5f) / 2.0f);
        int height = (int) ((rect.height() * 0.5f) / 2.0f);
        this.mCropRect = new Rect(rect.left - width, rect.top - height, rect.right + width, rect.bottom + height);
    }
}

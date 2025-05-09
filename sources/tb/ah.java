package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ah {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740376);
    }

    public static <T extends Serializable> T a(T t) throws IOException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Serializable) ipChange.ipc$dispatch("beb1e72", new Object[]{t}));
        }
        ObjectInputStream d = d(t);
        T t2 = (T) ((Serializable) d.readObject());
        d.close();
        return t2;
    }

    public static <K, V> Map<K, V> b(Map<K, V> map) throws IOException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b07bfaf4", new Object[]{map});
        }
        ObjectInputStream d = d(map);
        Map<K, V> map2 = (Map) d.readObject();
        d.close();
        return map2;
    }

    public static <T> List<T> c(List<T> list) throws IOException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1553adae", new Object[]{list});
        }
        ObjectInputStream d = d(list);
        List<T> list2 = (List) d.readObject();
        d.close();
        return list2;
    }

    public static ObjectInputStream d(Object obj) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectInputStream) ipChange.ipc$dispatch("1fe63bf9", new Object[]{obj});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
        return new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
    }
}

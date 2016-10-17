import com.fc.platform.commons.page.Page;
import com.qinguangfeng.Start;
import com.qinguangfeng.dao.entity.Topic;
import com.qinguangfeng.services.LogicTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value = Start.class)
public class TestSpring {
    @Autowired
    private LogicTopic logic;

    @Test
    public void testSp() {
        System.out.println(logic);
    }

    @Test
    public void testStart() {
        List<Topic> list = logic.findAll();
        for (Topic to : list) {
            System.out.println(to.getTname());
        }
    }

    @Test
    public void testPage() {
        Page<Topic> ps = logic.findPage(0, 2);
        List<Topic> list = ps.getContent();
        for (Topic to : list) {
            System.out.println(to.getTname());
        }
        System.out.println("总行数"+ps.getTotalElements());
        System.out.println("总行数"+ps.getTotalPages());
    }

    @Test
    public void testDele() {
     int num=   logic.deleTop(61);
        System.out.println(num);
    }

    @Test
    public void testFinAll() {
        Topic num=   logic.findTopAll(58);
        System.out.println(num.getTname());
    }


}

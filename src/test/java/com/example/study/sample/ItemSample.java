package com.example.study.sample;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Category;
import com.example.study.model.entity.Item;
import com.example.study.model.entity.Partner;
import com.example.study.model.enumclass.CategoryType;
import com.example.study.model.enumclass.ItemStatus;
import com.example.study.repository.CategoryRepository;
import com.example.study.repository.ItemRepository;
import com.example.study.repository.PartnerRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Slf4j
public class ItemSample extends StudyApplicationTests {

    private Random random = new Random();

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private PartnerRepository partnerRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void createAll(){
        createHomeAppliance();
        createClothing();
        createMultiShop();
        createInterior();
        createFood();
        createSports();
        createShoppingMall();
        createDutyFree();
        createBeauty();
    }


    @Test
    public void createHomeAppliance(){
        Category category = categoryRepository.findByType(CategoryType.COMPUTER);
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"호")
                        .title(p.getName()+"의 가전제품"+i+"호")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"의 가전제품"+i+"호"+"의 가전제품 입니다. 2019년도 신제품 입니다")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();

                itemRepository.save(item);
            }
        }
    }

    @Test
    public void createClothing(){

        Category category = categoryRepository.findByType(CategoryType.CLOTHING);
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"호")
                        .title(p.getName()+"의 의류제품"+i+"호")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"의 의류제품"+i+"호"+"의 겨울 상품 입니다. 2029년도 신제품 입니다")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }


    @Test
    public void createMultiShop(){

        Category category = categoryRepository.findByType(CategoryType.MULTI_SHOP);
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"호")
                        .title(p.getName()+"의 XX 제품"+i+"호")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"의 XX 제품"+i+"호"+"의 여러가지 상품 입니다. 2021년도 신제품 입니다")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }

    @Test
    public void createInterior(){

        Category category = categoryRepository.findByType(CategoryType.INTERIOR);
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"호")
                        .title(p.getName()+"의 가구"+i+"호")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"의 가구"+i+"호"+"의 원룸에 들어가는. 2023년도 신제품 입니다")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }

    @Test
    public void createFood(){

        Category category = categoryRepository.findByType(CategoryType.FOOD);
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"호")
                        .title(p.getName()+"의 제빵"+i+"호")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"의 제빵"+i+"호"+"의 생일 케이크 입니다")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }

    @Test
    public void createSports(){

        Category category = categoryRepository.findByType(CategoryType.SPORTS);
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"호")
                        .title(p.getName()+"의 겨울 스포츠"+i+"호")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"의 겨울 스포츠"+i+"호"+"의 스키 상품 입니다")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }

    @Test
    public void createShoppingMall(){

        Category category = categoryRepository.findByType(CategoryType.SHOPPING_MALL);
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"호")
                        .title(p.getName()+"의 OO 상품"+i+"호")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"의 OO상품"+i+"호"+"의 EE 상품 입니다")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }


    @Test
    public void createDutyFree(){

        Category category = categoryRepository.findByType(CategoryType.DUTY_FREE);
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"호")
                        .title(p.getName()+"의 면세상품"+i+"호")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"의 면세상품"+i+"호"+"의 면세 상품 입니다")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }


    @Test
    public void createBeauty(){

        Category category = categoryRepository.findByType(CategoryType.BEAUTY);
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"호")
                        .title(p.getName()+"의 OO 화장품"+i+"호")
                        .price(BigDecimal.valueOf((long)random.nextInt(99999)+1))
                        .content(p.getName()+"의 OO 화장품"+i+"호"+"의 상품 입니다")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }

    private LocalDateTime getRandomDate(){
        return LocalDateTime.of(2019,getRandomNumber(),getRandomNumber(),getRandomNumber(),getRandomNumber(),getRandomNumber());
    }

    private int getRandomNumber(){
        return random.nextInt(11)+1;
    }
}

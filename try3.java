/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class try3
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose a level");
		int level = sc.nextInt();
//	int level = 2;
		
		 // create instance of Random class
        Random rand = new Random();
  
		
		String L1[] = 
		{
		    "What is your favourite color?",
		    "What is your ideal pet?",
		    "What is your favourite dish?",
				"If you could live anywhere, where would it be?",

				"Who is your hero?",

				"What is your favourite book?",

				"If you could choose to do anything for a day, what would it be?",

				"Would you rather win the lottery or work at the perfect job? And why?",

				"Do you like or dislike surprises? Why or why not?",

				"What is your proudest accomplishment?",

				"What makes you laugh the most?",

				"Who would you want to be stranded with on a deserted island?",

				"If you could go back in time to change one thing, what would it be?",

				"If you could share a meal with any 4 individuals, living or dead, who would they be?",

				"What did you want to be when you were small?",

				" If you were a superhero, what powers would you have?",

				"List 3 of your pet peeves",

				"What is the worst gift you've ever received?",

				"What's on your bucket list this year?",

				"How would you describe your best friend?",

				"How do you feel about sharing your password with your partner?",

				"Where is your favourite place in the world to go?",

				"What are your top five favorite movies?",

				"What piece of culture or trend has died out, but you would like to see it make a comeback?",

				"What kinds of things are normal now but will be highly valued antiques a century later?",

				"What’s the best practical joke you’ve pulled or seen pulled?",

				"What weird smell do you really enjoy?",

				"If you inherited a private jet from a stranger, what would you do with it?",

				"Have you ever trusted your boyfriend to buy clothes for you?",

				"What’s something weird that you recommend everyone trying at least once?",

				"What country can you name but besides the name you know almost nothing else about it?",

				"What would be the worst thing to put into a piñata?",

				"If you were forced to create a new dance move, what would it be and what would you call it?",

				"What songs can you sing that I’ll know after hearing two words from the song?",

				"What’s the spiciest thing you’ve eaten? Would you ever eat it again?",

				"What unnecessary products or services do you consider necessary?",

				"Which fictional villain made you feel real hatred towards them?",

				"What habit do you have that you think not many other people have?",

				"How often is your brain on autopilot?",

				"What’s the grossest thing you’ve drunk?",

				"If colors had a taste, what would each color taste like?",

				"What names were ruined for you because you knew someone terrible with that name?",

				"What’s the best conspiracy theory you can make up on the spot?",

				"What gross and unhygienic things do people do that bothers you?",

				"What was the best thing about how your parents raised you?",

				"What would an amusement park filled with your biggest fears be like? What rides would it have?",

				"What do people really need to chill out about?",

				"If you could switch genders for a length of time of your choosing, would you? And if so, how long?",

				"What’s something you wish you had never learned how it was made or how it works?",

				"What crazy things will you do if you ever become rich?",

				"What scrambles your brain every time you think about it?",

				"What’s the weirdest wrong number text or phone call you’ve gotten?",

				"What is your favourite board game and why?",

				"Should Robin Hood be prosecuted for stealing from the rich and giving to the poor?",

				"Tell a joke",

				"A penguin walks into your room wearing a sombrero. What does he say and why?",

				"Bugs bunny breaks into your house, sprays sanitiser in the air, picks up your sister and hops away. What do you do?",

				"Who is buying seashells from Sally at the seashore, and why can't they just pick up seashells themselves?",

				"You're a new addition to the crayon box, what colour would you be and why?",

				"What's your least favourite social media app? Why?",

				"If you had to change your name to anything, what would it be and why?",

				"Recommend a show/movie to me",

				"Based on what you know about me, what book would you recommend I read?",

				"What compliment do you think I hear the most?",

				"What subject do you think I really thrived in at school? Did I ever fail or perform abysmally in any?",

				"What's the first thing you noticed about me?",

				"Do you think I was popular in school?",

				"What about me intrigues you?",

				"Each player write a message to the other. Fold and exchange. Open only once you two have parted.",

				"Do I remind you of anyone?",

				"What was the most rebellious decision you made growing up?",

				"What's your go-to guilty pleasure?",

				"What's your comfort food?",

				"What inspires you?",

		};
		
		String L2 [] = 
		{
		    "When was the last time you cried? Why?",
		    "What is something small that makes you really happy?",
				"What insecurity of yours holds you back the most?",

				"What do you value most in a friendship?",

				"What event or person took you the longest to get over?",

				"What do most people overestimate or underestimate about you?",

				"When was the last time you cried?",

				"When was the last time you felt so embarrassed you wanted to disappear?",

				"If you have, when was the moment you realised you weren't invincible?",

				"What has been your earliest recollection of happiness?",

				"When you're asked how are you, how often do you answer truthfully?",

				"What do you crave more of?",

				"What are you still trying to prove to yourself?",

				"Have you ever told someone I love you but didn't mean it? If so, why?",

				"How are you, really?",

				"Are you lying to yourself about anything?",

				"If there was one thing you could know about your future life, what would it be?",

				"What is a dream you've let go of?",

				"Have you changed your mind about anything recently?",

				"If you could get to know someone in your life on a deeper level, who would it be and why?",

				"What question are you trying to answer most in your life right now?",

				"What feeling do you miss the most?",

				"What is something you wouldn't want to change about yourself?",

				"Are you missing anyone right now? Do you think they're missing you too?",

				"What's something you feel like you didn't deserve?",

				"What's been the best compliment a stranger has ever given you?",

				"What's the last thing you lied about?",

				"What lesson took you the longest to unlearn?",

				"When was the last time you surprised yourself?",

				"What's the last thing you lied to your mother about?",

				"What event from the past do you most want to see a recording of?",

				"What would an amusement park designed specifically to make you happy, be like?",

				"What is something you probably should do, but will never do?",

				"What great idea would you like to try if you had enough money?",

				"Who is someone non-famous that everyone loves but you despise/dislike?",

				"Who is someone others don't like but you love?",

				"Criticise a popular belief",

				"How honest are you?",

				"Would you consider yourself self-aware?",

				"What's your hot take/super controversial opinion?",

				"What silly thing do you take a lot of pride in?",

				"What are you most grateful for?",

				"If you could hear every time someone said something good about you or something negative about you, which would you choose?",

				"What do you think people automatically assume about you when they look at you?",

				"If you could go through anyone in your life's phone, whose phone would you go through and what would you want to see?",

				"What would you change about yourself if you could?",

				"What is your biggest fear?",

				"What makes you really angry?",

				"What would you do if you found out your partner or best friend was diagnosed with a terminally ill disease?",

				"What is the craziest thing you’ve ever done and would you do it again?",

				"If a genie granted you 3 wishes right now, what would you wish for?",

				"Would you ever take back someone who cheated?",

				"What is a relationship deal breaker for you?",

				"If you are in a bad mood, do you prefer to be left alone or have someone to cheer you up?",

				"What’s the one thing that people always misunderstand about you?",

				"What is your idea of a perfect vacation?",

				"Speak about someone who you can talk to about just anything",

				"What did your past relationship teach you?",

				"Is flirting cheating?",

				"If you were given $15,000 to give the most amount of happiness to the most amount of people, what would you do?",

				"What annoys you the most in the world?",

				"What are you more afraid of, failure or success? Why?",

				"Do you think the image you have of yourself matches the image people see you as?",

				"What is a compliment you wish you received more frequently?",

				"What would your younger self not believe about your life today?",

				"Has a stranger ever changed your life?",

				"What title would you give this chapter in your life?",

				"How can you become a better person?",

				"What's been your happiest memory this past year?",

				"What's something that brought a smile to my face this week was ____",
		};
		
		String L3 [] = 
		{ 
		    "What is one thing you feel is missing from your life right now?",
		    "Who is someone you've met that you want to become closer to?",
				"What was the worst phase of your life?",

				"What are you currently working through that others don't see?",

				"Tell me a secret.",

				"What have you been taking for granted lately?",

				"Think of someone you really admire. Why did this person come to mind?",

				"Call someone you love but don't express this love to them often.",

				"Why do you think people expect a universe full of chaos and randomness to be fair?",

				"What’s your story?",

				"What do you wish you had more time for?",

				"Looking back on your life, what have you done that has given you the most satisfaction?",

				"Have you ever lost someone close to you?",

				"What’s your biggest regret in life?",

				"What’s the best piece of advice someone has given you?",

				"What’s something you learned recently that you really should have already known?",

				"What’s the craziest thing you’ve ever done for love?",

				"What do you most look forward to about getting old?",

				"What do you think is the hardest part about death?",

				"If everything was quantified, what life stats would like to see for yourself?",

				"What do you really wish you knew when you were younger?",

				"What options would come up if you could “right-click” people?",

				"What's the most pain you've ever been in that wasn't physical?",

				"When was the last time you had a gut feeling about something that turned out to be correct? How about a time your gut feeling was wrong?",

				"What's the biggest lie anyone has ever told you?",

				"If you could dedicate your life to solving one problem, what problem would you choose?",

				"What do you think my weakness is?",

				"What do I need to hear right now?",

				"How do our personalities complement each other?",

				"What about me most surprised you?",

				"What is something I have helped / can help you with?",

				"How does one earn your vulnerability? Have I earned it? How can I earn more?",

				"What do you admire most about me?",

				"What do you think your defining characteristic is?",

				"What do you think my defining characteristic is?",

				"Why do you think we met?",

				"What question do you hope I never ask you?",

				"What would make you feel closer to me?",

				"What is one topic of conversation that always makes you upset?",

				"What is something that can always make you cry easily?",

				"What do you think I should know about myself that perhaps I'm unaware of?",

				"What do you think I fear the most?",

				"What am I most qualified to give advice about?",

				"Who am I to you?",

				"How would you describe me to a stranger?",

				"What would be the perfect gift for me?",

				"What is one thing you think I can do that would dramatically improve my life?",

				"What about me is hardest for you to understand?",

				"What are you feeling a lot of lately?",

				"Wildcard: Ask a question you'd be too afraid to ask. Something you wouldn't dare to ask.",

				"What about yourself is hardest to admit?",

				"When was the last time you were able to use your pain to help someone else?",

				"What are your views on therapy?",

		};
	
	       // Generate random integers in range 0 to array length - 1 
        int rand_int1 = rand.nextInt(L1.length);
            int rand_int2 = rand.nextInt(L2.length);
                int rand_int3 = rand.nextInt(L3.length);
                
	if (level==1) 
	System.out.println(L1[rand_int1]);
	else if (level==2)
	System.out.println(L2[rand_int2]);
	
	else
	System.out.println(L3[rand_int3]);
	
}
}











